package com.kodilla.kodillapatterns2.decorator.pizza;

import com.kodilla.kodillapatterns2.decorator.taxiportal.TaxiOrder;

import java.math.BigDecimal;

public class AbstractPizzaOrderDecorator implements PizzaOrder {
    private final PizzaOrder pizzaOrder;

    public AbstractPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    @Override
    public BigDecimal getCost() {
        return pizzaOrder.getCost();
    }

    @Override
    public String getDescription(){
        return pizzaOrder.getDescription();
    }


}
