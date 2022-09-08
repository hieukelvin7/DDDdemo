package org.exemple.ports.spi;

import org.exemple.data.UserDto;

import java.util.List;

public interface UserPersistencePort {
    UserDto saveUser(UserDto userDto);
    UserDto updateUser(UserDto userDto);
    UserDto getUserById(Long id);
    List<UserDto> getAllUser();
}
