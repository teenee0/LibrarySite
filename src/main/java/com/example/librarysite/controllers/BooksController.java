package com.example.librarysite.controllers;

import com.example.librarysite.models.Books;
import com.example.librarysite.repo.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.awt.print.Book;


@Controller
public class BooksController {
     @Autowired
     private BooksRepository BooksRepository;

    @GetMapping("/books")
    public String books(Model model) {
        Iterable<Books> books = BooksRepository.findAll();
        model.addAttribute("books", books);
        model.addAttribute("title", "Страница книг");
        return "books";
    }
}

