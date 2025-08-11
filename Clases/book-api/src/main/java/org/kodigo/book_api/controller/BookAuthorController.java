package org.kodigo.book_api.controller;

import org.kodigo.book_api.entity.BookAuthor;
import org.kodigo.book_api.service.IBookAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookAuthorController {
    @Autowired
    private IBookAuthorService serviceBookAuthor;

    @GetMapping("/book-authors")
    public List<BookAuthor> getAllBookAuthors() {
        return serviceBookAuthor.findAllBookAuthors();
    }

    @PostMapping("/book-author")
    public BookAuthor saveBookAuthor(BookAuthor bookAuthor) {
        serviceBookAuthor.saveBookAuthor(bookAuthor);
        return bookAuthor;
    }

    @PutMapping("/book-author")
    public BookAuthor modifyBookAuthor(BookAuthor bookAuthor) {
        serviceBookAuthor.saveBookAuthor(bookAuthor);
        return bookAuthor;
    }

    @DeleteMapping("/book-author/{id}")
    public void deleteBookAuthor(@PathVariable Integer id) {
        serviceBookAuthor.deleteBookAuthor(id);
    }

}
