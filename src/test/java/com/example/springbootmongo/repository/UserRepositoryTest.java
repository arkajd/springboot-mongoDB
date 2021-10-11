package com.example.springbootmongo.repository;

import com.example.springbootmongo.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataMongoTest
class UserRepositoryTest {

    @Autowired
    private UserRepository underTest;

    @Test
    void shouldReturnUserByFirstName() {
        // given
        Integer id = 6;
        String firstName = "Gaurav";
        String lastName = "Madan";
        User user = new User(id, firstName, lastName);
        underTest.save(user);
        // when
        User expected = underTest.findByFirstName(firstName);
        // then
        assertThat(user).usingRecursiveComparison().isEqualTo(expected);
    }

    @Test
    void shouldNotReturnUserForNonExistingUsersFirstName() {
        // given
        // when
        String firstName = "Arjun";     // non-existing user
        User expected = underTest.findByFirstName(firstName);
        // then
        assertThat(expected).isNull();
    }

}