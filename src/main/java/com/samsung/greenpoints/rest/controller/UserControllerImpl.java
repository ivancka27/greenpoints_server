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
        return null;
    }

    @Override
    public UserDto getByIdAndEmail(long id, String email) {
        return null;
    }

    @Override
    public UserDto insert(User user) {
        return null;
    }

    @Override
    public UserDto update(User user) {
        return null;
    }

    @Override
    public void delete(long id) {

    }


}
