package org.example.mappers;

import org.example.entity.Basket;
import org.example.entity.User;
import org.exemple.data.BasketDto;
import org.exemple.data.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDto userToUserDto(User user);

    User userDtoToUser(UserDto userDto);

    List<UserDto> userListToUserDtoList(List<User> userList);

    List<User> UserDtoListToUserList(List<UserDto> userDtoList);
}
