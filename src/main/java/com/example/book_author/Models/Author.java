package com.example.book_author.Models;

import com.example.book_author.Enums.Gender;

public class Author {
    private String name;
    private int age;
    private Gender gender;
    private float rating;

    public Author() {
    }

    public Author(String name, int age, Gender gender, float rating) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
