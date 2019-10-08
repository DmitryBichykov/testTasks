package com.metanit;

public class Book {
    private int id;
    private String title;
    private String authors;
    private String publishingHouse;
    private int yearOfPublishing;
    private int numberPages;
    private double price;
    private String bindingType;

    public Book(int id, String title, String authors, String publishingHouse, int yearOfPublishing, int numberPages, double price, String bindingType) {
        this.id = id;
        this.title = title;
        this.authors = authors;
        this.publishingHouse = publishingHouse;
        this.yearOfPublishing = yearOfPublishing;
        this.numberPages = numberPages;
        this.price = price;
        this.bindingType = bindingType;
    }

    public String getAuthors(){
        return authors;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public String toString(){
        return String.format("ID: %d\tНазвание: %s\tАвтор: %S\tИздательство: %s\tГод издания: %d\tКоличество страниц: %d\tЦена: %.2f\t Тип переплета: %s",
                id,title,authors,publishingHouse,yearOfPublishing,numberPages,price,bindingType);
    }
}
