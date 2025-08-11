package org.kodigo.book_api.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "book_author")
public class BookAuthor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer authorId;
    private Integer bookId;

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    @Override
    public String toString() {
        return "BookAuthor{" +
                "id=" + id +
                ", authorId=" + authorId +
                ", bookId=" + bookId +
                '}';
    }
}

