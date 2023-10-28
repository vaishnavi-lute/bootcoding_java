package com.bootcoding.java.oops.composition.newExample;

public class Book3 {
    String bookName;
    String authorName;
    String publisherName;
    int pageCount;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
 public void printData(){
        Book book = new Book();
        book.setBookName("A Simple path");
     System.out.println(book.getBookName());
        book.setAuthorName("Luciana Vardey");
     System.out.println(book.getAuthorName());
        book.setPublisherName("J.N.Dixit");
     System.out.println(book.getPublisherName());
        book.setPageCount(250);
     System.out.println(book.getPageCount());

        Book2 book2 = new Book2();
     setBookName("The General and his Army");
     System.out.println( book2.getBookName());
     book2.setAuthorName("Georgy Vladimov");
     System.out.println( book2.getAuthorName());
     book2.setPublisherName("J.N.Dixit");
     System.out.println(book2.getPublisherName());
     book2.setPageCount(280);
     System.out.println(book2.getPageCount());

     Book3 book3 = new Book3();
     setBookName("Mukt Mala");
     System.out.println(book2.getBookName());
     book2.setAuthorName("Lakshman Hable");
     System.out.println(book2.getAuthorName());
     book2.setPublisherName("J.N.Dixit");
     System.out.println( book2.getPublisherName());
     book2.setPageCount(240);
     System.out.println(book2.getPageCount());
 }
 }

