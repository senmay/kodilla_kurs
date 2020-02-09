package com.kodilla.good.patterns.challenges;

public class Product {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getNameOfProduct() {
        return name;
    }

    public double getPriceOfProduct() {
        return price;
    }
}
