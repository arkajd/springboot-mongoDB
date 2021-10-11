package com.example.springbootmongo.service;

import com.example.springbootmongo.model.User;
import com.example.springbootmongo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository repository;

    public UserService(UserRepository repository){
        this.repository = repository;
    }

    public List<User> getAllUsers(){
        return repository.findAll();
    }

    public void addUser(User user){
        repository.save(user);
    }

    public User findUserByFirstName(String firstName){
        return repository.findByFirstName(firstName);
    }
}
