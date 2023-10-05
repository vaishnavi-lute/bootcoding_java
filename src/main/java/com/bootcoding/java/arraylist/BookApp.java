package com.bootcoding.java.arraylist;

import java.util.ArrayList;

public class BookApp {
    public static void main(String[] args) {
        //create the object of book class
        Book book = new Book();
        //crate a arraylist
        ArrayList<Book> insert = new ArrayList<>();


        book.publisherName="js";
        book.name="jaya";
        book.authorName="navneet";
        book.pages=89;
        book.price=99.98;
//        to add into list
       insert.add(book);
       //to get the values from arraylist
       for(int i=0;i<insert.size();i++)
       {
           System.out.println(insert.get(i).publisherName);
           System.out.println(insert.get(i).name);
           System.out.println(insert.get(i).authorName);
           System.out.println(insert.get(i).pages);
           System.out.println(insert.get(i).price);
       }
    }
}
