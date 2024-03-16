package com.first_spring_boot.spring.boot_first;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Merhaba, Spring Boot!";
    }
}