package com.nextivis.nishopping.app.controller;

import org.springframework.security.core.annotation.*;
import org.springframework.security.oauth2.jwt.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class OAuth2ResourceServerController {

    @GetMapping("/api/user/test")
    public String test(@AuthenticationPrincipal Jwt jwt) {
        return String.format("Hello, %s!", jwt.getSubject());
    }
}
