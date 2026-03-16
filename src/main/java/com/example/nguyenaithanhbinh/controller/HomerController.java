package com.example.nguyenaithanhbinh.controller;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HomerController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }
}
