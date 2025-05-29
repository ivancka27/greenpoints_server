package com.samsung.greenpoints.service;

import com.samsung.greenpoints.domain.User;
import com.samsung.greenpoints.exceptions.IdNotValidException;
import com.samsung.greenpoints.exceptions.UserAlreadyExistsException;
import com.samsung.greenpoints.exceptions.UserNotFoundException;
import com.samsung.greenpoints.repository.UserRepository;

import java.util.List;

public class UserServiceImpl implements UserService{

    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<User> getAll() {
        return repository.findAll();
    }

    @Override
    public User getById(long id) {
        if(id <= 0) throw new IdNotValidException("Id must be positive!");
        return repository.findById(id).orElseThrow(
                () -> new UserNotFoundException("User with id " + id + " was not found"));
    }

    @Override
    public User getByIdAndName(long id, String name) {
        if(id <= 0) throw new IdNotValidException("Id must be positive!");
        return repository.findUserByIdAndName(id, name);
    }

    @Override
    public User getByIdAndEmail(long id, String email) {
        if(id <= 0) throw new IdNotValidException("Id must be positive!");
        return repository.findUserByIdAndName(id, email);
    }

    @Override
    public User insert(User user) {
        long id = user.getId();
        if(id != 0){
            if(repository.count() > id) throw new UserAlreadyExistsException("User with id " + id + " already exists");
            throw new IdNotValidException("Id must be zero!");
        }
        return repository.save(user);
    }

    @Override
    public User update(User user) {
        if(user.getId() <= 0) throw new IdNotValidException("Id must be positive!");
        if(!repository.existsById(user.getId())){
            throw new UserNotFoundException("User with id " + user.getId() + " was not found");
        }
        return repository.save(user);
    }

    @Override
    public void delete(long id) {
        if(id <= 0) throw new IdNotValidException("Id must be positive!");
        if(!repository.existsById(id)){
            throw new UserNotFoundException("User with id " + id + " was not found");
        }
        repository.deleteById(id);
    }
}
