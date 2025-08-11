package org.kodigo.book_api.controller;

import org.kodigo.book_api.entity.Book;
import org.kodigo.book_api.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    private IBookService serviceBook;

    @GetMapping("/books")
    public List<Book> findAllBooks() {
        return serviceBook.findAllBooks();
    }

    @PostMapping("/book")
    public Book saveBook(@RequestBody Book book) {
        serviceBook.saveBook(book);
        return book;
    }

    @PutMapping("/book")
    public Book modifyBook(@RequestBody Book book) {
        serviceBook.saveBook(book);
        return book;
    }

    @DeleteMapping("/book/{id}")
    public String deleteBook(@PathVariable Integer id) {
        serviceBook.deleteBook(id);
        return "Book with ID " + id + " has been deleted successfully.";
    }
}
