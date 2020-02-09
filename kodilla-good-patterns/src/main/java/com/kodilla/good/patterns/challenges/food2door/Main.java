package com.kodilla.good.patterns.challenges.food2door;

public class Main {
    public static void main(String[] args) {

        DeliveryRequest deliveryRequest = new DeliveryRequest
                ("Extra Food Shop", "appsdle", 20);

        DeliveryProcessor deliveryProcessor = new DeliveryProcessor();
        deliveryProcessor.order(deliveryRequest);

    }
}
