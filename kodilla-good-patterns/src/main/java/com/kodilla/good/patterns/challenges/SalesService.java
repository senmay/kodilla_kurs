package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface SalesService {

    boolean sale (User user, LocalDate dateOfSale, Product product);
}
