package com.kodilla.good.patterns.challenges.food2door;

public class DeliveryRequest {
    private String foodSupplier;
    private String product;
    private int quantity;


    public DeliveryRequest(String foodSupplier, String product, int quantity) {
        this.foodSupplier = foodSupplier;
        this.product = product;
        this.quantity = quantity;
    }

    public String getFoodSupplier() {
        return foodSupplier;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
