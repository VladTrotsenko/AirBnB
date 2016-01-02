package gojava.dao;

import gojava.model.Reservation;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by root on 01.01.16.
 */
@Component
public class ReservationDAO extends AbstractDAO<Integer, Reservation> {

    @Transactional
    List<Reservation> findAll() {
        return null;
    }

    @Transactional
    Reservation findEntityById(Integer id) {
        Reservation reservation = entityManager.find(Reservation.class, id);
        return reservation;
    }

    @Transactional
    boolean delete(Integer id) {
        Reservation reservation = findEntityById(id);
        entityManager.remove(reservation);
        return true;
    }

    @Transactional
    public Reservation create(Reservation entity) {
        entityManager.persist(entity);
        return entity;
    }

    @Transactional
    public Reservation update(Reservation entity) {
        return null;
    }

}
