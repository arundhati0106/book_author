package com.example.book_author;

import com.example.book_author.Enums.Gender;
import com.example.book_author.Models.Author;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    Repository bookRepository;

    public String addBook(String name, int pages, Author author) {
        return bookRepository.addBook(name, pages, author);
    }

    public String addAuthor(String name, int age, Gender gender, float rating) {
        return bookRepository.addAuthor(name, age, gender, rating);
    }

    public List<Author> getAuthor(int age, float rating) {
        return bookRepository.getAuthor(age, rating);
    }

    public String updatePages(String bookName, int pages) {
        return bookRepository.updatePages(bookName, pages);
    }

    public int getBookCount(float rating) {
        return bookRepository.getBookCount(rating);
    }
}
