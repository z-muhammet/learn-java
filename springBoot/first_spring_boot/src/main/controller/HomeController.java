package com.first_spring_boot.spring.boot_first;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController

@RequestMapping("/")
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Merhaba, Spring Boot!";
    }

    @GetMapping("/heb")
    public String heb() {

        return "heb";
    }

    @GetMapping("/404")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }

}