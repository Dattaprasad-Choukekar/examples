package com.dattaprasad.jenkins.autodeployment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/hello")
public class RestController {
    @GetMapping
    public String getHello() {
        return "Hello World " + new Date().toString();
    }
}
