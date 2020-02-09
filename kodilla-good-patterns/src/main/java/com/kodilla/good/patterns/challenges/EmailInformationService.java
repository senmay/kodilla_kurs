package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class EmailInformationService implements InformationService {

    public void inform(User user, Product product, LocalDate dateOfSale, boolean isSold) {
        if (isSold) {
            System.out.println(user.getFirstName() + " " + user.getSurname()
                    + " bought " + product.getNameOfProduct());
            System.out.println("Purchase Date: " + dateOfSale.toString());
            System.out.println("Price: " + product.getPriceOfProduct() + " zł");
        } else {
            System.out.println(user.getFirstName() + " " + user.getSurname()
                    + " Sorry, expression is invalid");
        }
    }
}
