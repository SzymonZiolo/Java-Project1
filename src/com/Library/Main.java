package com.Library;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Pan Tadeusz");
        Book book2 = new Book("Matrix");
        Book book3 = new Book("Ogniem i mieczem");

        List<Book> booksForLibrary = new ArrayList<>();
        booksForLibrary.add(book1);
        booksForLibrary.add(book2);
        booksForLibrary.add(book3);

        Library library = new Library(booksForLibrary);

        System.out.println(library.allBooks.size());

        library.deleteBook(book2);
        library.deleteBook("Pan Tadeusz");

        //library.addBook(book1);
        //library.addBook(book2);
        //library.addBook(book3);

        Book borrowedBook = library.borrow("Ogniem i mieczem");

        System.out.println("Borrowed book: " + borrowedBook.getTitle());

        System.out.println(library.allBooks.size());

        System.out.println(book2.getTitle());

        Book bookToReturn = borrowedBook;

        boolean returnSuccess =  library.returnBook(bookToReturn);

        System.out.println(returnSuccess);


    }
}
