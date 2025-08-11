package org.kodigo.book_api.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "book")

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String isbn;
    private String title;
    private Date publication_date;
    private Double price;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getPublication_date() {
        return publication_date;
    }

    public void setPublication_date(Date publicationDate) {
        this.publication_date = publicationDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", publicationDate=" + publication_date +
                ", price=" + price +
                '}';
    }
}
