package org.kodigo.book_api.repository;

import org.kodigo.book_api.entity.BookAuthor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookAuthorRepository extends JpaRepository<BookAuthor, Integer> {

}
