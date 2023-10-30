package com.springbook.SpringBookProject.controllers;

import com.springbook.SpringBookProject.entities.Book;
import com.springbook.SpringBookProject.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getBooks(){
        List<Book> list1 = bookService.getAllBooks();
        if (list1.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(list1));
    }

    @GetMapping("/books/{id}")
    public ResponseEntity<Book> getById(@PathVariable("id") int id){
        Book book = bookService.getBookById(id);
        if (book == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(book));
    }

    @PostMapping("/books")
    public ResponseEntity<Book> addBook(@RequestBody Book book){
         try {
             Book b = bookService.addBook(book);
             return ResponseEntity.of(Optional.of(b));
         }
         catch (Exception e){
             e.printStackTrace();
             return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
         }
    }
}
