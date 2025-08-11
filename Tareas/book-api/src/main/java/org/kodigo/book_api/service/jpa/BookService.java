package org.kodigo.book_api.service.jpa;

import org.kodigo.book_api.entity.Book;
import org.kodigo.book_api.repository.BookRepository;
import org.kodigo.book_api.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService {

    @Autowired
    private BookRepository bookRepository;


    @Override
    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public void saveBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void deleteBook(int id) {
        bookRepository.deleteById(id);
    }
}
