package com.fmc.oasisinfobytetask4.service.implementation;

import com.fmc.oasisinfobytetask4.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserServiceImplTest {
    @Autowired
    private  UserServiceImpl userService;
    User user=User.builder().email("malonechawora@gmail.com").password("1234").
                build();
    @Test
    void save() {
        boolean login = userService.login(user);
        System.out.println(login);
    }

    @Test
    void update() {
    }

    @Test
    void read() {
    }

    @Test
    void delete() {
    }
}