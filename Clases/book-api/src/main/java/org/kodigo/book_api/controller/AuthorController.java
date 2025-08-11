package org.kodigo.book_api.controller;

import org.kodigo.book_api.entity.Author;
import org.kodigo.book_api.service.IAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AuthorController {
    @Autowired
    private IAuthorService serviceAuthor;

    @GetMapping("/authors")
    public List<Author> findAllAuthors() {
        return serviceAuthor.findAllAuthors();
    }

    @PostMapping("/author")
    public Author saveAuthor(@RequestBody Author author) {
        serviceAuthor.saveAuthor(author);
        return author;
    }

    @PutMapping("/author")
    public Author modifyAuthor(@RequestBody Author author) {
        serviceAuthor.saveAuthor(author);
        return author;
    }

    @DeleteMapping("/author/{id}")
    public String deleteAuthor(@PathVariable Integer id) {
        serviceAuthor.deleteAuthor(id);
        return "Author with ID " + id + " has been deleted successfully.";
    }




}
