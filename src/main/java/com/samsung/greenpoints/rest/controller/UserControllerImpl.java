package com.samsung.greenpoints.rest.controller;

import com.samsung.greenpoints.domain.User;
import com.samsung.greenpoints.rest.dto.UserDto;
import com.samsung.greenpoints.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/user")
@RestController
public class UserControllerImpl implements UserController{

    private final UserService userService;

    public UserControllerImpl(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    @Override
    public List<UserDto> getAll() {
        return userService.getAll().stream().map(e -> UserDto.userToDto(e)).toList();
    }

    @GetMapping(path = "/user/{c_id}")
    @Override
    public UserDto getById(@PathVariable(name = "c_id") long id) {
        return UserDto.userToDto(userService.getById(id));
    }

    @GetMapping("/byIdAndName")
    @Override
    public UserDto getByIdAndName(@RequestParam long id, @RequestParam String name) {
        return UserDto.userToDto(userService.getByIdAndName(id, name));
    }

    @GetMapping("/byIdAndEmail")
    @Override
    public UserDto getByIdAndEmail(@RequestParam long id, @RequestParam String email) {
        return UserDto.userToDto(userService.getByIdAndEmail(id, email));
    }

    @GetMapping("/byEmail")
    @Override
    public UserDto getByEmail(@RequestParam String email) {
        return UserDto.userToDto(userService.getByEmail(email));
    }

    @PostMapping
    @Override
    public UserDto insert(@RequestBody UserDto user) {
        return UserDto.userToDto(userService.insert(UserDto.userFromDto(user)));
    }

    @PutMapping
    @Override
    public UserDto update(@RequestBody UserDto user) {
        return UserDto.userToDto(userService.update(UserDto.userFromDto(user)));
    }

    @DeleteMapping("/{id}")
    @Override
    public void delete(@PathVariable long id) {
        userService.delete(id);
    }


}
