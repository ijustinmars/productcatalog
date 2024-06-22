package org.productcatalog.model;

import java.util.Date;

public class Book extends Product implements IBook{
    private Date publicationDate;
    private String author;
    private String title;
    private String editorial;

    public Book(Date publicationDate, String author, String title, String editorial, int price) {
        super(price);
        this.publicationDate = publicationDate;
        this.author = author;
        this.title = title;
        this.editorial = editorial;
    }

    @Override
    public Date getPublicationDate() {
        return this.publicationDate;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getEditorial() {
        return this.editorial;
    }

    @Override
    public double getSalePrice() {
        return getPrice() * 0.95;
    }
}
