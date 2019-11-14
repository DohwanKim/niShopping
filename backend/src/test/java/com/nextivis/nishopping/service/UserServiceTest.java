package com.nextivis.nishopping.service;

import com.nextivis.nishopping.domain.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
@Transactional
public class UserServiceTest {
    @Autowired
    UserService userService;

    @Test
    public void createUser(){
        User user = User.builder()
                .userId("testUserId")
                .name("testName")
                .gender(User.GenderType.MEN)
                .address("test Address")
                .birthDate(LocalDateTime.now())
                .email("testEmail")
                .emailVerify(1)
                .registerDate(LocalDateTime.now())
                .lastLoggedIn(LocalDateTime.now())
                .build();
        assertThat(userService.createUser(user)).isEqualTo(1);

    }
}
