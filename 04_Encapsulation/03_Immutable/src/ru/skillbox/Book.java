package ru.skillbox;

public class Book {
    private final String name;
    private final String author;
    private final int pagesNumber;
    private final int isbookNumber;

    public Book(String name, String author, int pagesNumber, int isbookNumber) {
        this.name = name;
        this.author = author;
        this.pagesNumber = pagesNumber;
        this.isbookNumber = isbookNumber;
    }
}
