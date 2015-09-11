package com.apress.books.client;

import com.apress.books.dao.BookDAO;
import com.apress.books.dao.BookDAOImpl;
import com.apress.books.model.Book;

import java.util.List;

/**
 * Created by Rekish on 9/11/2015.
 */
public class BookApp {
    private static BookDAO bookDAO = new BookDAOImpl();

    public static void main(String[] args) {
        // List all books
        System.err.println("Listing all Books:");
        findAllBooks();
        System.out.println();
        // Search book by keyword
        System.err.println("Search book by keyword in book title : Groovy:");

        searchBooks("Groovy");
        System.out.println();

        System.err.println("Search book by keyword in author's name : Josh:");

        searchBooks("Josh");

    }

    private static void findAllBooks() {
        List<Book> books = bookDAO.findAllBooks();
        for(Book book : books) {
            System.out.println(book);
        }
    }

    private static void searchBooks(String keyWord) {
        List<Book> books = bookDAO.searchBooksByKeyword(keyWord);
        for(Book book : books) {
            System.out.println(book);
        }
    }
}
