package com.example.customlistview;

public class Product {
    private String title;
    private String description;
    private String type;
    private double price;
    private boolean onSale;

    public Product(String title, String description, String type, double price, boolean onSale) {
        this.title = title;
        this.description = description;
        this.type = type;
        this.price = price;
        this.onSale = onSale;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOnSale() {
        return onSale;
    }

    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }
}
