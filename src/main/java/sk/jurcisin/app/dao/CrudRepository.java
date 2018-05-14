package sk.jurcisin.app.dao;

import java.io.Serializable;
import java.util.Optional;

interface CrudRepository<T, ID extends Serializable> {

    <S extends T> S save(S entity);

    Optional<T> findById(ID primaryKey);

    Iterable<T> findAll();

    long count();

    void delete(T entity);

    boolean existsById(ID primaryKey);
}
