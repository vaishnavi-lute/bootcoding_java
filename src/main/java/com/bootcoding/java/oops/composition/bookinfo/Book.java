package com.bootcoding.java.oops.composition.bookinfo;

public class Book {
    String bookName;
    double price;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void bookData(){
        System.out.println("Print Book data :" + bookName + price );
    }
    public void printData(){
        Author author  = new Author();
        Publisher publisher = new Publisher();
        Book book = new Book();

        author.setAuthorName("Ravindranath Tagore");
        System.out.println(author.getAuthorName());
        author.setDate("12-10-2023");
        System.out.println(author.getDate());
        author.setAuthorSignature("R.tagore");
        System.out.println(author.getAuthorSignature());
        author.print();

        publisher.setPublisherName("National Book Trust");
        System.out.println(publisher.getPublisherName());
        publisher.setPublishDate("25-11-2023");
        System.out.println(publisher.getPublishDate());
        publisher.Data();

        book.setBookName("Gitanjali");
        System.out.println( book.getBookName());

        book.setPrice(100.00);
        System.out.println(book.getPrice());
    }
}
