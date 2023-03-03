package com.example.book_author.Models;

public class Book {
    private String bookname;
    private int pages;
    private Author author;

    public Book() {
    }

    public Book(String bookname, int pages, Author author) {
        this.bookname = bookname;
        this.pages = pages;
        this.author = author;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
