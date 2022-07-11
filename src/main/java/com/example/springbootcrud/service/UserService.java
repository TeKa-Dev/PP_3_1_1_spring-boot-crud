package com.example.springbootcrud.service;

import com.example.springbootcrud.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAllUsers();

    void saveUser(User user);

    User findUser(Long id);

    void deleteUser(Long id);
}
