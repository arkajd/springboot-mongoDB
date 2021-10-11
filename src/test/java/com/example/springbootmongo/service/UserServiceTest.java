package com.example.springbootmongo.service;

import com.example.springbootmongo.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    private UserRepository repository;
    private UserService underTest;

    @BeforeEach
    void setUp() {
        underTest = new UserService(repository);
    }

    @Test
    void getAllUsers() {
        // when
        underTest.getAllUsers();
        // then
        verify(repository).findAll();
    }

    @Test
    @Disabled
    void addUser() {
    }

    @Test
    @Disabled
    void findUserByFirstName() {
    }
}