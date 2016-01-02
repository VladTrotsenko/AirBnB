package gojava.dao;

import gojava.model.City;
import org.hibernate.HibernateException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by root on 17.11.15.
 */

/**
 * CityDao as well as UserDao, ApartmentDao doesn't implement AbstractDao interface
 * because if it do, we have some kind of springException
 */
@Component
public class CityDAO extends AbstractDAO<Integer, City>{

    @Transactional
    public List<City> findAll() {
        List <City> cities = entityManager.createQuery("Select a from City a", City.class)
                .getResultList();
        return cities;
    }

    @Transactional
    public City findEntityById(Integer id) {
        return entityManager.find(City.class, id);
    }

    public boolean delete(Integer id) {
        return false;
    }

    @Transactional
    public City create(City entity) {
        entityManager.persist(entity);
        return entity;
    }

    public City update(City entity) {
        return null;
    }

    public boolean isUnique(City entity) throws SQLException {
        List<City> cities = findAll();
        if (!cities.contains(entity)) {
            return true;
        }
        return false;
    }
}