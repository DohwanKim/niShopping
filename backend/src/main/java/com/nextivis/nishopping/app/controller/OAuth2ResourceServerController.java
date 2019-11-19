package com.nextivis.nishopping.app.controller;

import com.nextivis.nishopping.app.vo.UserClaimVO;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class OAuth2ResourceServerController {

    @GetMapping("/api/user/test")
    public UserClaimVO test(@AuthenticationPrincipal Jwt jwt) {
        return UserClaimVO.transUserClaimVO(jwt.getClaims());
    }
}
