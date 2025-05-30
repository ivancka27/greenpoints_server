package com.samsung.greenpoints.rest.controller;

import com.samsung.greenpoints.domain.User;
import com.samsung.greenpoints.rest.dto.UserDto;
import com.samsung.greenpoints.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserControllerImpl implements UserController{

    private final UserService userService;

    public UserControllerImpl(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/user")
    @Override
    public List<UserDto> getAll() {
        return userService.getAll().stream().map(e -> UserDto.userToDto(e)).toList();
    }

    @GetMapping(path = "/user/{c_id}")
    @Override
    public UserDto getById(long id) {
        return UserDto.userToDto(userService.getById(id));
    }

    @Override
    public UserDto getByIdAndName(long id, String name) {
        return UserDto.userToDto(userService.getByIdAndName(id, name));
    }

    @Override
    public UserDto getByIdAndEmail(long id, String email) {
        return UserDto.userToDto(userService.getByIdAndEmail(id, email));
    }

    @Override
    public UserDto insert(UserDto user) {
        return UserDto.userToDto(userService.insert(UserDto.userFromDto(user)));
    }

    @Override
    public UserDto update(UserDto user) {
        return UserDto.userToDto(userService.update(UserDto.userFromDto(user)));
    }

    @Override
    public void delete(long id) {
        userService.delete(id);
    }


}
