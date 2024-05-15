package org.example;

public class Library {

    private Book[] knyguMasyvas;

    public Library() {
        this.knyguMasyvas = new Book[0];
    }

    public Library(Book[] knyguMasyvas) {
        this.knyguMasyvas = knyguMasyvas;
    }

    public Book[] getKnyguMasyvas() {
        return knyguMasyvas;
    }

    public void setKnyguMasyvas(Book[] knyguMasyvas) {
        this.knyguMasyvas = knyguMasyvas;
    }

    public void addBook(Book knyga){
        int index  = knyguMasyvas.length;
        Book[]  naujasknyguMasyvas = new Book[index+1];
        for(int i = 0 ; i < index ; i++){
            naujasknyguMasyvas[i] = knyguMasyvas[i];
        }
        naujasknyguMasyvas[index] = knyga;
        knyguMasyvas = naujasknyguMasyvas;
    }


    public Book findBook(String pavadinimas){
        int index = -1;
        for (int i = 0; i < knyguMasyvas.length; i++) {
            if (knyguMasyvas[i].getPavadinimas().equals(pavadinimas)) {
                index = i;
                break;
            }
        }
        if (index == -1) return null;

        return knyguMasyvas[index];
    }

    public Book removeBook(String pavadinimas) throws KnygosNeraEx{
        int index = -1;
        for(int i = 0; i < knyguMasyvas.length; i++){
            if (knyguMasyvas[i].getPavadinimas().equals(pavadinimas)){
                index = i;
                break;
            }
        }
        if (index == -1) throw new KnygosNeraEx("Tokios knygos nera");

        Book[] naujasknyguMasyvas = new Book[knyguMasyvas.length-1];

        for(int i = 0 ; i < index ; i++){
            naujasknyguMasyvas[i] = knyguMasyvas[i];
        }
        for(int i = index ; i < naujasknyguMasyvas.length; i++){
            naujasknyguMasyvas[i] = knyguMasyvas[i+1];
        }
        Book book = knyguMasyvas[index];
        knyguMasyvas = naujasknyguMasyvas;

        return book;
    }
    public void insertBook(int index, Book book){

        Book[] naujasknyguMasyvas = new Book[knyguMasyvas.length+1];

        for(int i = 0 ; i < index ; i++){
            naujasknyguMasyvas[i] = knyguMasyvas[i];
        }
        for(int i = index ; i < knyguMasyvas.length; i++){
            naujasknyguMasyvas[i+1] = knyguMasyvas[i];
        }

        naujasknyguMasyvas[index] = book;
        knyguMasyvas = naujasknyguMasyvas;


    }









}
