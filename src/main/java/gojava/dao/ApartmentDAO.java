package gojava.dao;

import gojava.model.AbstractEntity;
import gojava.model.Apartment;
import gojava.model.City;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import sun.java2d.pipe.AAShapePipe;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.Date;
import java.util.List;

/**
 * Created by root on 04.11.15.
 */
@Component
public class ApartmentDAO extends AbstractDAO<Integer, Apartment> {

    @Transactional
    public List<Apartment> findAll() {
        List <Apartment> apartments = entityManager
                .createQuery("Select a from Apartment a", Apartment.class)
                .getResultList();
        return apartments;
    }

    @Transactional
    public Apartment findEntityById(Integer id) {
        Apartment apartment = entityManager.find(Apartment.class, id);
        return apartment;
    }

    @Transactional
    public List<Apartment> findEntitiesByCity(String cityName) {
        Query query = entityManager
                .createQuery("Select a from Apartment a where cityName = :cityName", Apartment.class);
        query.setParameter("cityName", cityName);
        List<Apartment> apartments = query.getResultList();
        return apartments;
    }

    @Transactional
    public List<Apartment> findEntitiesByTwoDates(Date startDate, Date endDate) {
        return  null;
    }

    @Transactional
    public boolean delete(Integer id) {
        Apartment apartment = findEntityById(id);
        entityManager.remove(apartment);
        return true;
    }

    @Transactional
    public boolean delete(Apartment entity) {
        entityManager.remove(entity);
        return true;
    }

    @Transactional
    public Apartment create(Apartment entity) {
        entityManager.persist(entity);
        return entity;
    }

    @Transactional
    public Apartment update(Apartment entity) {
        return null;
    }

    @Transactional
    public Apartment updateIsAvailable(Apartment entity, boolean flag) {
        Query query = entityManager.createQuery("update Apartment a set a.isAvailable=:flag " +
                "where a.id=:entityId");
        query.setParameter("entityId", entity.getId());
        query.setParameter("flag", flag);
        query.executeUpdate();
        return entity;
    }
}
