package com.api.book.bootrestbook.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String language;
    @OneToOne(mappedBy = "author")
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    @JsonBackReference
    private Book book;

    public Author() {
    }

    public Author(int id, String name, String language, Book book) {
        this.id = id;
        this.name = name;
        this.language = language;
        this.book = book;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }


}
