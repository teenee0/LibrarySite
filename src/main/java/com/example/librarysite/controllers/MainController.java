package com.example.librarysite.controllers;


import com.example.librarysite.models.Books;
import com.example.librarysite.repo.BooksRepository;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private final BooksRepository booksRepository;

    public MainController(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

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
    @GetMapping("/bookadd")
    public String bookadd(Model model) {
        return "bookadd";
    }
    @PreAuthorize("isAuthenticated()")
    @PostMapping("/bookadd")
    public String bookaddPost(@RequestParam String title, @RequestParam String author,
                          @RequestParam String publisher, @RequestParam String isbn, Model model) {
        Books book = new Books(title, author, publisher, isbn);
        booksRepository.save(book);
        return "redirect:/books";

    }
    @GetMapping("/login")
    public String login() {
        return "login"; // Это вернет шаблон login.html
    }
//    @GetMapping("/auth")
//    public String greeting(Model model) {
//        model.addAttribute("name", "Hello World");
//        return "greeting";
//    }

}
