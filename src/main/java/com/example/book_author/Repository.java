package com.example.book_author;

import com.example.book_author.Enums.Gender;
import com.example.book_author.Models.Author;
import com.example.book_author.Models.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@org.springframework.stereotype.Repository
public class Repository {
    HashMap<String, Book> bookMap = new HashMap<>();
    HashMap<String, Author> authorMap = new HashMap<String, Author>();

    public String addBook(String name, int pages, Author author) {
        Book book = new Book();
        book.setAuthor(author);
        book.setBookname(name);
        book.setPages(pages);

        bookMap.put(name, book);
        return "Book added";
    }

    public String addAuthor(String name, int age, Gender gender, float rating) {
        Author author = new Author();
        author.setAge(age);
        author.setGender(gender);
        author.setName(name);
        author.setRating(rating);

        authorMap.put(name, author);
        return "Author added";
    }

    public List<Author> getAuthor(int age, float rating) {
        List<Author> author_reqd = new ArrayList<>();

        for (Author author : authorMap.values()) {
            if ((author.getAge() < age) && (author.getRating() > rating)) {
                author_reqd.add(author);
            }
        }
        return author_reqd;
    }

    public String updatePages(String bookName, int pages) {
        for (Book book : bookMap.values()) {
            if (book.getBookname().equals(bookName)) {
                book.setPages(pages);
            }
        }
        return "pages updated";
    }

    public int getBookCount(float rating) {
        int count = 0;
        for(Book book: bookMap.values()) {
            if(book.getAuthor().getRating() > rating) {
                count++;
            }
        }

        return count;
    }
}