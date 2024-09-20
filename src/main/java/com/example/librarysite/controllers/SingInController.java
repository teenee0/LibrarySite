package com.example.librarysite.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SingInController {
    @GetMapping("/auth")
    public String auth(Model model) {
        model.addAttribute("title", "Страница входа");
        return "login";
    }
}
