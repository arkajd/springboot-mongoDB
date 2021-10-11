package com.example.springbootmongo.controller;

import com.example.springbootmongo.model.User;
import com.example.springbootmongo.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/all")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping
    public ResponseEntity addUser(@RequestBody User user){
        userService.addUser(user);
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    @GetMapping("/{firstName}")
    public User findUserByFirstName(@PathVariable String firstName){
        return userService.findUserByFirstName(firstName);
    }
}
