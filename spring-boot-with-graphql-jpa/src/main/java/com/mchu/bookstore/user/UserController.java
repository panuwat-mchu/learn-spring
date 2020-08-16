package com.mchu.bookstore.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;

@RestController
@Slf4j
public class UserController {

    @GetMapping("/user")
    public String user(@AuthenticationPrincipal Jwt jwt){
        String role = jwt.getClaimAsString("role");
        log.info(jwt.getClaims().toString());
        log.info(jwt.getClaimAsString("scope"));
        log.info(role);
        return "Hello";
    }

}
