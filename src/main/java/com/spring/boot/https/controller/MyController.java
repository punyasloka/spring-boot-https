package com.spring.boot.https.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/data")
    public String getMessage() {
        return " Accessed by HTTPS protocol";
    }
}
