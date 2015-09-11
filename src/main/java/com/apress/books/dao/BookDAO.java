package com.apress.books.dao;

import com.apress.books.model.Book;
import com.apress.books.model.Category;

import java.util.List;

/**
 * Created by Rekish on 9/11/2015.
 */
public interface BookDAO {
    public List<Book>findAllBooks();

    public List<Book>searchBooksByKeyword(String keyWord);

    public List<Category>findAllCategories();

    public void insert(Book book);

    public void update(Book book);

    public void delete(Long bookId);

}
