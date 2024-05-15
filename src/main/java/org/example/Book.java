package org.example;

public class Book {
    private String pavadinimas;
    private String author;

    public Book(String pavadinimas, String author) {
        this.pavadinimas = pavadinimas;
        this.author = author;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public String getAuthor() {
        return author;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book:" + pavadinimas + " *** " + "Author:" + author;
    }
}
