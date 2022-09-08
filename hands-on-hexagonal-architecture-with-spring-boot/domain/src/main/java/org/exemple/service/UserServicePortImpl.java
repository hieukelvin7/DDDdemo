package org.exemple.service;

import org.exemple.data.UserDto;
import org.exemple.ports.api.UserServicePort;
import org.exemple.ports.spi.UserPersistencePort;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServicePortImpl implements UserServicePort {
    private final UserPersistencePort userPersistencePort;

    @Autowired
    public UserServicePortImpl(UserPersistencePort userPersistencePort) {
        this.userPersistencePort = userPersistencePort;
    }

    @Override
    public UserDto saveUser(UserDto basket) {
        return userPersistencePort.saveUser(basket);
    }

    @Override
    public UserDto updateUser(UserDto basket) {
        return userPersistencePort.updateUser(basket);
    }

    @Override
    public UserDto getUserById(Long id) {
        return userPersistencePort.getUserById(id);
    }

    @Override
    public List<UserDto> getAllUser() {
        return userPersistencePort.getAllUser();
    }
}
