package com.example.springbootmongo.repository;

import com.example.springbootmongo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, Integer> {

    User findByFirstName(String firstName);
}
