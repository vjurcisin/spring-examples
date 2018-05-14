package sk.jurcisin.app.service;

import io.swagger.client.model.UserRequestDto;
import io.swagger.client.model.UserResponseDto;

import java.util.List;

public interface UserService {

    List<UserResponseDto> getUsers();
    UserResponseDto getUserById(long id);
    UserResponseDto createUser(UserRequestDto user);
}
