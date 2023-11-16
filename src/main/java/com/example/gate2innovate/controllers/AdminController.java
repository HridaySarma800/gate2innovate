package com.example.gate2innovate.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/admin")
@PreAuthorize("hasRole('ADMIN')")
public class AdminController {

    @GetMapping
    @PreAuthorize("hasAuthority('admin:read')")
    public String get() {
        return "GET:: This is a GET request only accessible by the role ADMIN";
    }

    @PostMapping
    @PreAuthorize("hasAuthority('admin:create')")
    public String post() {
        return "POST:: This is a POST request only accessible by the role ADMIN";
    }

    @PutMapping
    @PreAuthorize("hasAuthority('admin:update')")
    public String put() {
        return "PUT:: This is a PUT request only accessible by the role ADMIN";
    }

    @DeleteMapping
    @PreAuthorize("hasAuthority('admin:delete')")
    public String delete() {
        return "DELETE:: This is a DELETE request only accessible by the role ADMIN";
    }
}
