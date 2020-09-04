package com.offcn.controller;

import org.springframework.stereotype.Controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
   @GetMapping("/first")
    public String  getHello(Model model){
        model.addAttribute("message","say Hello Thymeleaf!");
        return "index";
    }
}
