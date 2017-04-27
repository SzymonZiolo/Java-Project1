package com.Library;

import java.util.ArrayList;
import java.util.List;


public class Library {

    public Book searchBookByTitle(String title){
        boolean isBookFound = false;
        int idx = 0 ;
        Book book = null;

        while(isBookFound == false){
            book = allBooks.get(idx);
            isBookFound = book.getTitle().equals(title);
            idx++;
        }

        return book;
    }


    List<Book> allBooks = new ArrayList<>();

    Library(List<Book> acquiredBooks) {
        allBooks.addAll(acquiredBooks);
    }

    public void addBook (Book book) {
        allBooks.add(book);
    }

    public Book borrow(String title){
        return searchBookByTitle(title);
    }

    public void deleteBook (Book book){
        allBooks.remove(book);
        System.out.println("Removed book: " + book.getTitle());
    }

    public void deleteBook (String bookTitle){
        Book bookFound = searchBookByTitle(bookTitle);
        if (bookFound != null){
            allBooks.remove(bookFound);
            System.out.println("Removed book: " + bookFound.getTitle());
        }
    }

    public boolean returnBook(Book bookToReturn){


        return false;
    }




}