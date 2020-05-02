package com.mbsystems.ch02ex5.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello5")
    public String hello() {
        return "Basil Hello5";
    }
}
