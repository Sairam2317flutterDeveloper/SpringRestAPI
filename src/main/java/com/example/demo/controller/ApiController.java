package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class ApiController {

    // 1️⃣ Simple Hello API
    @GetMapping("/hello")
    public String hello() {
        return "Hello Sairam! Welcome to Spring Boot";
    }

    // 2️⃣ Students API (returns list)
    @GetMapping("/students")
    public List<String> getStudents() {
        return Arrays.asList("Sairam", "Rupa", "Swami", "Suneel");
    }

    // 3️⃣ Login API (POST)
    @PostMapping("/login"
    public String login(@RequestParam String username, @RequestParam String password) {

        if (username.equals("admin") && password.equals("1234")) {
            return  " sairam Login successful!";
        }
        return " sairam Login failed!";
    }
}
///////
////
/////

