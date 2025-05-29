package com.samsung.greenpoints.rest.controller;

import com.samsung.greenpoints.domain.User;
import com.samsung.greenpoints.rest.dto.UserDto;

import java.util.List;

public interface UserController {

    List<UserDto> getAll();
    UserDto getById(long id);
    UserDto getByIdAndName(long id, String name);
    UserDto getByIdAndEmail(long id, String email);
    UserDto insert(User user);
    UserDto update(User user);
    void delete(long id);

}
