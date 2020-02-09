package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class EmailInformationService implements InformationService {

    public void inform(User user, Product product, LocalDate dateOfSale, boolean isSold) {
        if (isSold) {
            System.out.println(user.getFirstName() + " " + user.getSurname()
                    + " dokonałeś/aś zakupu produktu " + product.getNameOfProduct());
            System.out.println("Data kupna: " + dateOfSale.toString());
            System.out.println("Cena zakupu: " + product.getPriceOfProduct() + " zł");
        } else {
            System.out.println(user.getFirstName() + " " + user.getSurname()
                    + " Niestety nie możemy zrealizować Twojego zamówienia");
        }
    }
}
