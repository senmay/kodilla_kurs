package com.kodilla.good.patterns.challenges.food2door;

public class FindSupplier {
    static FoodSupplier find(String name) throws NoFoodSupplierException  {

        switch (name.toLowerCase()) {
            case "extra food shop":
                return new ExtraFoodShop();
            case "healthy shop":
                return new HealthyShop();
            case "gluten free shop":
                return new GlutenFreeShop();
        }
        throw new NoFoodSupplierException ();
    }
}
