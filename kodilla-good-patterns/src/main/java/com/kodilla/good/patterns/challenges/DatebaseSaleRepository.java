package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class DatebaseSaleRepository implements SalesRepository {

    @Override
    public void createSaleProduct(User user, Product product, LocalDate dateOfSale) {
        System.out.println("\nSelling " + product.getNameOfProduct() + " for user " + user.getUserName() +
              " in " + dateOfSale.toString());
    }
}
