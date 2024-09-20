package com.example.librarysite.repo;

import com.example.librarysite.models.Books;
import org.springframework.data.repository.CrudRepository;



public interface BooksRepository extends CrudRepository<Books, Long> {

}
