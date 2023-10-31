package com.bootcoding.java.oops.composition.bookinfo;

public class Publisher {
    String publisherName;
    String publishDate;

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public void Data(){
        System.out.println("Print Publisher data :" + publisherName  + " , " + publishDate);
    }

}
