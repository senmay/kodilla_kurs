package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShop implements FoodSupplier {
    public boolean process(String foodSupplier, String product, int quantity) {
        if (quantity > 10) {
            System.out.println("The " + foodSupplier + " can deliver product.");
            return true;
        } else {
            System.out.println("You have to order more.");
            return false;
        }
    }
}
