package com.example.todoBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hi")
    public String index(Model model){
        model.addAttribute("name", "김보하");
        return "index";
    }
}
