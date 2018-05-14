package sk.jurcisin.app.controller;

import io.swagger.client.model.UserRequestDto;
import io.swagger.client.model.UserResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sk.jurcisin.app.service.UserService;

@RequestMapping(path = "/v2/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public UserResponseDto getUser(@RequestBody UserRequestDto requestBody) {
        return userService.createUser(requestBody);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public UserResponseDto getUserById(@RequestParam(value="id", defaultValue = "1") long id) {
        return userService.getUserById(id);
    }
}
