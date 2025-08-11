package org.kodigo.book_api.repository;

import org.kodigo.book_api.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
