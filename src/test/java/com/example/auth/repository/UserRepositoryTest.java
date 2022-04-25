package com.example.auth.repository;

import com.example.auth.models.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {
    @Autowired
    UserRepository userRepositoryr;

    @Test
    void findByUsername() {
    }

    @Test
    void existsByUsername() {
    }

    @Test
    void itShoudcheckifsutdentexistsByEmail() {
//        //given
//        String email ="dhia@outlook.com";
//        User user = new User(
//                "dhia",
//                email,
//        );
//    userRepositoryr.save(user);
//        //when
//        Boolean exists = userRepositoryr.existsByEmail(email);
//        //then
//        assertThat(exists).isTrue();
    }

}