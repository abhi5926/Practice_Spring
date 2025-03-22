package com.example.SpringBootMVC.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("/")
    public String home(){
        return "index.html";

    }
    @GetMapping("/ab")
    public String hometwo(){
        return "demo.html";

    }

}
