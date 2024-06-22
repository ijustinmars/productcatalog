package org.productcatalog.model;

public class IPhone extends Electronic{
    private String model;
    private String color;

    public IPhone(String maker, String model, String color, int price) {
        super(maker, price);
        this.model = model;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getSalePrice() {
        return getPrice() * 0.9;
    }
}
