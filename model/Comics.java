package org.productcatalog.model;

import java.util.Date;

public class Comics extends Book{
    private String character;

    public Comics(Date publicationDate, String author, String title, String editorial, String character,int price) {
        super(publicationDate, author, title, editorial, price);
        this.character = character;
    }

    public String getCharacter() {
        return character;
    }

    @Override
    public double getSalePrice() {
        return this.getPrice() * 0.85;
    }
}
