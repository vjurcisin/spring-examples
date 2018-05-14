package sk.jurcisin.app.dao;

import org.springframework.stereotype.Repository;
import sk.jurcisin.app.model.User;

import java.util.Optional;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public <S extends User> S save(S entity) {
        return null;
    }

    @Override
    public Optional<User> findById(Long primaryKey) {
        return Optional.empty();
    }

    @Override
    public Iterable<User> findAll() {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(User entity) {

    }

    @Override
    public boolean existsById(Long primaryKey) {
        return false;
    }
}
