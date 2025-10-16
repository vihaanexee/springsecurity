package com.security.app.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class securityController {
    @GetMapping("/hello")
    public String hello(){
            return "hello";
    }

    @GetMapping("/user")
    public String userEndpoint(){
        return "hello user!";
    }
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    public String adminEndpoint(){
        return "hello admin!";
    }
}
