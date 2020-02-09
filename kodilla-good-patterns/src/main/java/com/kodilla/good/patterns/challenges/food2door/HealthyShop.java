package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShop implements FoodSupplier {
    public boolean process(String foodSupplier, String product, int quantity) {
        if (quantity == 1) {
            System.out.println("The " + foodSupplier + " can deliver product.");
            return true;
        } else {
            System.out.println("You can order on 1 product");
            return false;
        }
    }
}
