package com.metanit.catalog;

public class Books {
    private String author;
    private String name;
    private String description;

    public Books(String author, String name, String description) {
        this.author = author;
        this.name = name;
        this.description = description;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
