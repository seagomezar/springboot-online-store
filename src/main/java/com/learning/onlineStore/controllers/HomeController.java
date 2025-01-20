package com.learning.onlineStore.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Online Store");
        model.addAttribute("subtitle", "A Spring boot + thymeleaf Online Store");
        model.addAttribute("contentTemplate", "views/index");
        return "app";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "Online Store");
        model.addAttribute("subtitle", "A Spring boot + thymeleaf Online Store");
        model.addAttribute("contentTemplate", "views/about");
        return "app";
    }
}
