/*Scenario 4:
Library Management

There are multiple records of books with (title, author, publication year).
We have to write Java 8 code to filter all books that were published after 2010.*/

package com.logical.program.jdk8;

import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private int publicationYear;

    Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    
    public int getPublicationYear() {
        return publicationYear;
    }
}

public class Library_Management_Scenario {
    public static void main(String[] args) {
        List<Book> book = new ArrayList<>();
        book.add(new Book("C Programming","C Author", 2011));
        book.add(new Book("Java Programming","Java Author",2003));
        book.add(new Book("Python Programming","Python Author",2015));
        book.add(new Book("React Programming","React Author", 2000));
        book.add(new Book("C++ Programming","C++ Author", 2002));
        book.stream().filter(b -> b.getPublicationYear()>2010).forEach(b->System.out.println(b.getTitle()));
    }
}
