package org.exemple.ports.api;

import org.exemple.data.BasketDto;
import org.exemple.data.UserDto;

import java.util.List;

public interface UserServicePort {
    UserDto saveUser(UserDto userDto);
    UserDto updateUser(UserDto userDto);
    UserDto getUserById(Long id);
    List<UserDto> getAllUser();
}
