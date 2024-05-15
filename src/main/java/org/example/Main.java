package org.example;


public class Main {
    public static void main(String[] args) throws KnygosNeraEx {


        Library library = new Library();
        Book book1 = new Book("Pavadinimas1","Autorius1");
        Book book2 = new Book("Pavadinimas2","Autorius2");
        Book book3 = new Book("Pavadinimas3","Autorius3");
        Book book4 = new Book("Pavadinimas4","Autorius4");
        Book book5 = new Book("Pavadinimas5","Autorius5");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        System.out.println();
        for(Book b: library.getKnyguMasyvas()){
            System.out.println(b);
        }


        Book bookremoved = library.removeBook("Pavadinimas2");

        System.out.println();
        for(Book b: library.getKnyguMasyvas()){
            System.out.println(b);
        }

        System.out.println("Ištrinta");
        System.out.println(bookremoved);


        Book bookFound = library.findBook("Pavadinimas14");

        System.out.println();
        System.out.println("Rasta");
        System.out.println(bookFound);


        library.insertBook(2, new Book("PavadinimasInsert","AutoriusInsert"));

        System.out.println();
        for(Book b: library.getKnyguMasyvas()){
            System.out.println(b);
        }






    }
}