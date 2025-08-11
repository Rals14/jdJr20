package org.kodigo.book_api.service;

import org.kodigo.book_api.entity.BookAuthor;

import java.util.List;

public interface IBookAuthorService {
    List<BookAuthor> findAllBookAuthors();

    void saveBookAuthor(BookAuthor bookAuthor);
    void deleteBookAuthor(Integer bookAuthorId);
}
