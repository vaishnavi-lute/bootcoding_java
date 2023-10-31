package com.bootcoding.java.oops.composition.practice2;

public class BookApp {
    public static void main(String[] args) {

    Author author1 = new Author();
    author1.setAge(32);
    author1.setName("Satyajit Ray");
    author1.setAuthorSignature("s.ray");
        System.out.println("Name of Author 1:" + author1.getName());
    Author author2 = new Author();
    author2.setName("Rajneesh");
        System.out.println("Name of Author 2:" + author2.getName());

    Publication publisher = new Publication();
    publisher.setCompanyName("KBT");
        System.out.println("Company Name : " + publisher.getCompanyName());
    publisher.setAddress("India");
        System.out.println("Location: " + publisher.getAddress());
    publisher.setSince(1995);
        System.out.println("Since: " + publisher.getSince());

    Book myBook = new Book();
    myBook.setPublisher(publisher);
    myBook.setTitle("King of Kingdom");
    Author[] authors = new Author[2];
    authors[0]= author1;
    authors[1]=author2;
    myBook.setAuthors(authors);

    PrintMethod print = new PrintMethod();
    print.print(myBook);
    }
}