package com.example.librarysite.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class DebtorsController {
    @GetMapping("/debtors")
    public String books(Model model) {
        model.addAttribute("title", "Страница должников");
        return "debtors";
    }
}
