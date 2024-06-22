package org.productcatalog.model;

abstract public class Electronic extends Product implements IElectronic {
    private String maker;

    public Electronic(String maker, int price) {
        super(price);
        this.maker = maker;
    }

    @Override
    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }
}