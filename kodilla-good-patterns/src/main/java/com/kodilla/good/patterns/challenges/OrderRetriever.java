package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRetriever {

    public Order retrieve() {

        User user = new User("Adam", "Kowalski", "Kzaczun", "kowal@gmail.com");
        Product product = new Product("Pufa", 30.22);
        Order order = new Order(user, LocalDate.of(2015, 01, 05), product);

        return order;
    }
}
