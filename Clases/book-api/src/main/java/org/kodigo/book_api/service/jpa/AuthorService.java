package org.kodigo.book_api.service.jpa;

import org.kodigo.book_api.entity.Author;
import org.kodigo.book_api.repository.AuthorRepository;
import org.kodigo.book_api.repository.BookRepository;
import org.kodigo.book_api.service.IAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService implements IAuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public List<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public void saveAuthor(Author author) {
        authorRepository.save(author);
    }

    @Override
    public void deleteAuthor(int id) {
        authorRepository.deleteById(id);
    }
}
