package com.bootcoding.java.oops.composition.practice2;

public class PrintMethod {
    public void print(Book mybook){
        System.out.println(mybook.getTitle());
        Author[] authors = mybook.getAuthors();
        for(int i = 0; i<authors.length; i++){
            System.out.println(authors[i].getName());
        }
        System.out.println(mybook.getPublisher().getCompanyName());
        System.out.println(mybook.getPublisher().getAddress());
        System.out.println(mybook.getPublisher().getSince());
    }
}
