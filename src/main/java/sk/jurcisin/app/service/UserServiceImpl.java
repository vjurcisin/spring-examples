package sk.jurcisin.app.service;

import io.swagger.client.model.UserRequestDto;
import io.swagger.client.model.UserResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.jurcisin.app.dao.UserDao;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public List<UserResponseDto> getUsers() {
        return null;
    }

    @Override
    public UserResponseDto getUserById(long id) {
        return null;
    }

    @Override
    public UserResponseDto createUser(UserRequestDto user) {
        return null;
    }
}
