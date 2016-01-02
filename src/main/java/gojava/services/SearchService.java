package gojava.services;

import gojava.dao.ApartmentDAO;
import gojava.dao.CityDAO;
import gojava.model.Apartment;
import gojava.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * Created by root on 16.12.15.
 */
@Component
public class SearchService {

    @Autowired
    CityDAO cityDAO;

    public City findCityByName(String cityName) {
        List<City> cities = cityDAO.findAll();
        for (City city : cities) {
            if (cityName.equals(city.getCityName())) {
                return city;
            }
        }
        return null;
    }
/*

    @Autowired
    ApartmentDAO apartmentDAO;

    public List<Apartment> findApartmentsByCity(String cityName) {
        return apartmentDAO.findEntitiesByCity(cityName);
    }

    public List<Apartment> findApartmentsByDate(Date startDate, Date endDate) {
        return apartmentDAO.findEntitiesByTwoDates(startDate, endDate);
    }
*/

}
