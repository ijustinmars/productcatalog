package org.productcatalog.model;

abstract public class Product implements IProduct {
    private int price;

    public Product(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
