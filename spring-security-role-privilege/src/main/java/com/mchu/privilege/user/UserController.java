package com.mchu.privilege.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@Slf4j
@RestController
public class UserController {

    @GetMapping("/users")
    @PreAuthorize("hasRole('ADMIN') or hasAuthority('WRITE_PRIVILEGE')")
    public String getAllUsers(@AuthenticationPrincipal Principal auth){
        if(auth != null)
            log.debug(auth.toString());
        log.debug(">hello");
        return "Hello";
    }

}
