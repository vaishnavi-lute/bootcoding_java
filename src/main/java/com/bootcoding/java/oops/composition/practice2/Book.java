package com.bootcoding.java.oops.composition.practice2;

import com.bootcoding.java.PrimeNumber;

public class Book {
    private String Title;
    private Author[] authors;
    private Publication publisher;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public Publication getPublisher() {
        return publisher;
    }

    public void setPublisher(Publication publisher) {
        this.publisher = publisher;
    }
}


