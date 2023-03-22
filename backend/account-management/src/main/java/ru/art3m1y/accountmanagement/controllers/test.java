package ru.art3m1y.accountmanagement.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    @GetMapping
    public String get() {
        return "123321123";
    }
}
