package org.example.controller;

import org.exemple.data.BasketDto;
import org.exemple.data.UserDto;
import org.exemple.ports.api.BasketServicePort;
import org.exemple.ports.api.UserServicePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class UserController {
    @Autowired
    private UserServicePort userServicePort;

    @PostMapping("/admin/add")
    public UserDto addUser(@RequestBody UserDto userDto) {
        return userServicePort.saveUser(userDto);
    }

    @PutMapping("/user/update")
    public UserDto updateUser(@RequestBody UserDto userDto) {
        return userServicePort.updateUser(userDto);
    }

    @GetMapping("/admin/get/{id}")
    public UserDto getUserByID(@PathVariable long id) {
        return userServicePort.getUserById(id);
    }

    @GetMapping("/admin/get")
    public List<UserDto> getAllUsers() {
        return userServicePort.getAllUser();
    }
}
