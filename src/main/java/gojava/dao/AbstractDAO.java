package gojava.dao;

import gojava.model.AbstractEntity;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by root on 01.01.16.
 */
@Component
public abstract class AbstractDAO<K, T extends AbstractEntity> {

    @PersistenceContext
    EntityManager entityManager = null;

    abstract List<T> findAll();
    abstract T findEntityById(K id);
    abstract boolean delete(K id);
    abstract T create(T entity);
    abstract T update(T entity);

}
