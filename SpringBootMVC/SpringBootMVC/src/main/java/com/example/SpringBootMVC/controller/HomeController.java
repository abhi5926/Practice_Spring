package com.example.SpringBootMVC.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class HomeController {
    @RequestMapping("/ab")
    public String home(){
        return "index.jsp";
    }
}
