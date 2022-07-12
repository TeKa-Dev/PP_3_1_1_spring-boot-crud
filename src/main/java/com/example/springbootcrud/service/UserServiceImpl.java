package com.example.springbootcrud.service;

import com.example.springbootcrud.entity.User;
import com.example.springbootcrud.exception.UserNotFoundException;
import com.example.springbootcrud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Transactional
    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User findUser(Long id) {
        Optional<User> optional =  userRepository.findById(id);
        if (optional.isEmpty()) {
            throw new UserNotFoundException(String.format("User with id=%d not found", id));
        }
        return optional.get();
    }

    @Transactional
    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
