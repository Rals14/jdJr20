package org.kodigo.book_api.service;

import org.kodigo.book_api.entity.Book;

import java.util.List;

public interface IBookService {
    List<Book> findAllBooks();

    void saveBook(Book book);

    void deleteBook(int id);
}
