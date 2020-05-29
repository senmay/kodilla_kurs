package com.kodilla.kodillapatterns2.decorator.pizza;

import com.kodilla.kodillapatterns2.decorator.taxiportal.TaxiOrder;

import java.math.BigDecimal;

public class AdditionalCheeseForPizzaDecorator extends AbstractPizzaOrderDecorator {
    public AdditionalCheeseForPizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3));
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " + additional cheese";
    }
}
