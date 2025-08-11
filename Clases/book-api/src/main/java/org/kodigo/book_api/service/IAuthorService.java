package org.kodigo.book_api.service;

import org.kodigo.book_api.entity.Author;

import java.util.List;

public interface IAuthorService {
    List<Author> findAllAuthors();

    void saveAuthor(Author author);

    void deleteAuthor(int id);
}
