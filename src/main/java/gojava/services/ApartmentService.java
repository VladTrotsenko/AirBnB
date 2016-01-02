package gojava.services;

import gojava.dao.ApartmentDAO;
import gojava.model.Apartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by root on 18.12.15.
 */
@Component
public class ApartmentService {

    @Autowired
    ApartmentDAO apartmentDAO;

    public Apartment registerApartment(Apartment apartment) {
        apartmentDAO.create(apartment);
        return apartment;
    }

    public List<Apartment> getApartmentsByCityName(String cityName) {
        return apartmentDAO.findEntitiesByCity(cityName);
    }

    public Apartment getApartmentById(Integer id) {
        return apartmentDAO.findEntityById(id);
    }

}
