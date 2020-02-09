package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class FurnitureSaleService implements SalesService {

    @Override
    public boolean sale(User user, LocalDate dateOfSale, Product product) {
        System.out.println("Sprzedaż " + product.getNameOfProduct() + " w dniu " + dateOfSale.toString()
                + ", kupujący: " + user.getFirstName());
        return true;
    }
}
