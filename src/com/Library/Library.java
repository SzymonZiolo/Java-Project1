package com.Library;

import java.util.ArrayList;
import java.util.List;


public class Library {

    List<Book> allBooks = new ArrayList<>();

    Library(List<Book> acquiredBooks) {
        allBooks.addAll(acquiredBooks);
    }

    public void addBook (Book book) {
        allBooks.add(book);
    }

    public void deleteBook (Book book){
        allBooks.remove(book);
    }

    public void deleteBook (String bookTitle){
        boolean isBookToDelete = false;
        int idx = 0 ;
        Book book = null;

        while(isBookToDelete == false){
            book = allBooks.get(idx);
            isBookToDelete = book.getTitle().equals(bookTitle);
            idx++;
        }
        if(isBookToDelete == true) {
            allBooks.remove(book);
            System.out.println("Removed book: " + book.getTitle());
        }
    }


}