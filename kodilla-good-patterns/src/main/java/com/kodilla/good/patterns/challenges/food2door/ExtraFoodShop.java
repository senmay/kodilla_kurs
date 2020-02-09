package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShop implements FoodSupplier {
    public boolean process(String foodSupplier, String product, int quantity) {
        if (quantity > 0) {
            System.out.println("The " + foodSupplier + " can deliver product.");
            return true;
        } else {
            System.out.println("Please order more than zero.");
            return false;
        }
    }
}