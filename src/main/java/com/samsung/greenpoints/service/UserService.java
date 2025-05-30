package com.samsung.greenpoints.service;

import com.samsung.greenpoints.domain.User;

import java.util.List;

public interface UserService {

    List<User> getAll();
    User getById(long id);
    User getByIdAndName(long id, String name);
    User getByIdAndEmail(long id, String email);
    User getByEmail(String email);
    User insert(User user);
    User update(User user);
    void delete(long id);
}
