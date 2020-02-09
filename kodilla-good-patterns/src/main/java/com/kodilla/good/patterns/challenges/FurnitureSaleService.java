package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class FurnitureSaleService implements SalesService {

    @Override
    public boolean sale(User user, LocalDate dateOfSale, Product product) {
        System.out.println("Selling " + product.getNameOfProduct() + " in " + dateOfSale.toString()
                + ", Buyer: " + user.getFirstName());
        return true;
    }
}
