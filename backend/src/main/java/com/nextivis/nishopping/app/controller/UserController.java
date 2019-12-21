package com.nextivis.nishopping.app.controller;

import com.nextivis.nishopping.domain.entity.User;
import com.nextivis.nishopping.domain.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/create")
    public int createUser() {
        return 1;
    }

    @GetMapping("/check")
    public Boolean existCheck() {
        return userService.existingUser("asf");
    }
}
