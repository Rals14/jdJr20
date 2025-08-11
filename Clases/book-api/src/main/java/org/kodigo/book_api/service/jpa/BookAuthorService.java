package org.kodigo.book_api.service.jpa;

import org.kodigo.book_api.entity.BookAuthor;
import org.kodigo.book_api.repository.BookAuthorRepository;
import org.kodigo.book_api.repository.BookRepository;
import org.kodigo.book_api.service.IBookAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookAuthorService implements IBookAuthorService {
    @Autowired
    BookAuthorRepository bookAuthorRepository;

    @Override
    public List<BookAuthor> findAllBookAuthors() {
        return bookAuthorRepository.findAll();
    }

    @Override
    public void saveBookAuthor(BookAuthor bookAuthor) {
        bookAuthorRepository.save(bookAuthor);
    }

    @Override
    public void deleteBookAuthor(Integer bookAuthorId) {
        bookAuthorRepository.deleteById(bookAuthorId);
    }
}
