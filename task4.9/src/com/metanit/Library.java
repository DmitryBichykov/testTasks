package com.metanit;

public class Library {
    private Book[] books=new Book[10];
    private int index=0;

    public void setBooks(Book  books) {
        this.books[index]= books;
        index++;
    }

    public void findBooksByAuthor(String author){
        for(Book i:books){
            if (i.getAuthors().equals(author)) {
                System.out.println(i.toString());
            }
        }
    }

    public void findBooksByPublishingHouse(String publishingHouse){
        for (Book i:books) {
            if (i.getPublishingHouse().equals(publishingHouse)) {
                System.out.println(i.toString());
            }
        }
    }

    public void findBooksAfterSpecifiedYear(int yearOfPublishing){
        for (Book i:books) {
            if (i.getYearOfPublishing()>yearOfPublishing) {
                System.out.println(i.toString());
            }
        }
    }
}
