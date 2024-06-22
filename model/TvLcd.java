package org.productcatalog.model;

public class TvLcd extends Electronic{
    private int inches;

    public TvLcd(String maker, int inches, int price) {
        super(maker, price);
        this.inches = inches;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    @Override
    public double getSalePrice() {
        return getPrice() * 0.8;
    }
}
