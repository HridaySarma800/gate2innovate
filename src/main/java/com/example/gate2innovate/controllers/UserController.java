package com.example.gate2innovate.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
@PreAuthorize("hasRole('USER')")
public class UserController {

    @GetMapping
    @PreAuthorize("hasAuthority('user:read')")
    public String get() {
        return "GET:: This is a GET request accessible by USER";
    }

    @PostMapping
    @PreAuthorize("hasAuthority('user:create')")
    public String post() {
        return "POST:: This is a POST request accessible by USER";
    }

    @PutMapping
    @PreAuthorize("hasAuthority('user:update')")
    public String put() {
        return "PUT:: This is a PUT request accessible by USER";
    }

    @DeleteMapping
    @PreAuthorize("hasAuthority('user:delete')")
    public String delete() {
        return "DELETE:: This is a DELETE request accessible by USER";
    }
}
