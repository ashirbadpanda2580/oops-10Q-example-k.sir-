package com.jspiders.p2;

class Item {
    private String title;
    private String author;
    private int publicationYear;

    public Item(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    void getDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
    }
}

class Book extends Item {
    private String genre;
    private String ISBN;

    public Book(String title, String author, int publicationYear, String genre, String ISBN) {
        super(title, author, publicationYear);
        this.genre = genre;
        this.ISBN = ISBN;
    }

    void read() {
        System.out.println("Genre name: "+genre);
        System.out.println("ISBN: "+ISBN);
    }
}

class EBook extends Book {
    private double fileSize;
    private String format;

    public EBook(String title, String author, int publicationYear, String genre, String ISBN, double fileSize, String format) {
        super(title, author, publicationYear, genre, ISBN);
        this.fileSize = fileSize;
        this.format = format;
    }

    void ebookDetails() {
    	System.out.println("FileSize: "+fileSize);
        System.out.println("format: "+format);
    }
}

public class MultiLevel1 {
    public static void main(String[] args) {
        Item item = new Item("Generic Title", "Generic Author", 2000);
        item.getDetails();

        System.out.println("===========================================");
        EBook eBook = new EBook("Digital Fortress", "Dan Brown", 1998, "Thriller", "978-0312263126", 1.5, "PDF");
        eBook.getDetails();
        eBook.ebookDetails();
    }
}
