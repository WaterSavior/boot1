package org.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {
    @GetMapping("/hi")
    public String index(@RequestParam(name="name", required = false) String visitorName, Model model){
        if(visitorName == null || visitorName.isEmpty()) {
            model.addAttribute("name", "홍길동");
        } else {
            model.addAttribute("name", visitorName);
        }
        return "index";
    }
}
