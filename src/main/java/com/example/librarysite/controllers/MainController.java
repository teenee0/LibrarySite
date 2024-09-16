package com.example.librarysite.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String greeting(Model model) {
        model.addAttribute("title", "Главная страница");
        return "greeting";
    }
//    @GetMapping("/books")
//    public String greeting(Model model) {
//        model.addAttribute("name", "Hello World");
//        return "greeting";
//    }
//    @GetMapping("/debtors")
//    public String greeting(Model model) {
//        model.addAttribute("name", "Hello World");
//        return "greeting";
//    }
    @GetMapping("/support")
    public String support(Model model) {
        model.addAttribute("title", "Поддержка");
        return "support";
    }
//    @GetMapping("/auth")
//    public String greeting(Model model) {
//        model.addAttribute("name", "Hello World");
//        return "greeting";
//    }

}
