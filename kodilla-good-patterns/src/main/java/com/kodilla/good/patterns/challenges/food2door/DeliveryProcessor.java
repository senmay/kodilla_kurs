package com.kodilla.good.patterns.challenges.food2door;

public class DeliveryProcessor {

    public void order(DeliveryRequest deliveryRequest) {
        try {
            FoodSupplier name = FindSupplier.find(deliveryRequest.getFoodSupplier());
            boolean isAccepted = name.process(deliveryRequest.getFoodSupplier(),
                    deliveryRequest.getProduct(),
                    deliveryRequest.getQuantity());

            if (isAccepted) {
                System.out.println("Delivery order accepted.");
            } else {
                System.out.println("Delivery order rejected.");
            }
        } catch (Exception e) {
            System.out.println("Supplier not found.");
        }
    }
}
