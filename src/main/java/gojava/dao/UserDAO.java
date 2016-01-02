package gojava.dao;

import gojava.model.User;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.jws.soap.SOAPBinding;
import javax.persistence.*;
import java.util.List;

/**
 * Created by root on 04.11.15.
 */
@Component
public class UserDAO extends AbstractDAO<Integer, User> {

    /** JPA **/
    /*private EntityManagerFactory entityManagerFactory =
            Persistence.getPersistenceUtil("AirbnbPU");
    private EntityManager entityManager = entityManagerFactory.createEntityManager();
    private EntityTransaction entityTransaction = null;*/

    /** Spring JPA **/

    @Transactional
    public List<User> findAll() {
        List <User> users = entityManager.createQuery("Select a from User a", User.class)
                .getResultList();
        return users;
    }

    @Transactional
    public User findEntityById(Integer id) {
        User user = entityManager.find(User.class, id);
        return user;
    }

    @Transactional
    public boolean delete(Integer id) {
        User user = findEntityById(id);
        entityManager.remove(user);
        return true;
    }

    public boolean delete(User entity) {
        return false;
    }

    @Transactional
    public User create(User entity) {
        entityManager.persist(entity);
        return entity;
    }

    @Transactional
    public User update(User entity) {
        return null;
    }

    @Transactional
    public User updateIsHost(User entity) {
        //TODO: implement
        return null;
    }
}
