package com.bootcoding.java.oops.composition.bookinfo;

public class Author {
    String authorName;
    String date;
    String authorSignature;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAuthorSignature() {
        return authorSignature;
    }

    public void setAuthorSignature(String authorSignature) {
        this.authorSignature = authorSignature;
    }

    public void print(){
        System.out.println("Print details of Author :" + authorName + " , " +  date  + " , " +  authorSignature);
    }

}
