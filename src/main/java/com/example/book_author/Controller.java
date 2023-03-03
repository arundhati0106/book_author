package com.example.book_author;

import com.example.book_author.Enums.Gender;
import com.example.book_author.Models.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("book")
public class Controller {
    @Autowired
    Service bookService;

    @PostMapping("add-book")
    public ResponseEntity<String> addBook(@RequestParam String name, @RequestParam int pages, @RequestParam Author author) {
        String result = bookService.addBook(name, pages, author);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    @PostMapping("add-author")
    public ResponseEntity<String> addAuthor(@RequestParam String name, @RequestParam int age, @RequestParam Gender gender, @RequestParam float rating) {
        String result = bookService.addAuthor(name, age, gender, rating);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    @GetMapping("get-author")
    public ResponseEntity<List<Author>> getAuthor(@RequestParam int age, @RequestParam float rating) {
        List<Author> result = bookService.getAuthor(age, rating);
        return new ResponseEntity<>(result, HttpStatus.FOUND);
    }

    @PutMapping("update-pages")
    public ResponseEntity<String> updatePages(@RequestParam String bookName, @RequestParam int pages) {
        String result = bookService.updatePages(bookName, pages);
        return new ResponseEntity<>(result, HttpStatus.ACCEPTED);
    }

    @GetMapping("books-Count")
    public ResponseEntity<Integer> getBookCount(@RequestParam float rating) {
        Integer result = bookService.getBookCount(rating);
        return new ResponseEntity<>(result, HttpStatus.FOUND);
    }
}
