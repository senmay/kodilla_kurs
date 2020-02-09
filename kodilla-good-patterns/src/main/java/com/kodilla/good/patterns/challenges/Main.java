package com.kodilla.good.patterns.challenges;

public class Main {
    public static void main(String[] args) {

        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new EmailInformationService(),
                new FurnitureSaleService(), new DatebaseSaleRepository());
        productOrderService.process(order);

    }
}
