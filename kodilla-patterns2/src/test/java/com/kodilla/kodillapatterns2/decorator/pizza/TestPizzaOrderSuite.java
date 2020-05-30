package com.kodilla.kodillapatterns2.decorator.pizza;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class TestPizzaOrderSuite {

    @Test
    public void testCostOfBasicPizzaOrder() {
        //Given
        PizzaOrder theOrder = new BasicPizza();
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    void testDescriptionPizzaOrder() {
        PizzaOrder theOrder = new BasicPizza();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza ingredients: cheese + tomato sauce", description);
    }

    @Test
    public void testCostOfChickendAndAdditionalCheesePizzaOrder() {
        //Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new ChickenForPizzaDecorator(theOrder);
        theOrder = new AdditionalCheeseForPizzaDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(25), calculatedCost);
        }

    @Test
    void testDescriptionOfChickendAndAdditionalCheesePizzaOrder() {
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new ChickenForPizzaDecorator(theOrder);
        theOrder = new AdditionalCheeseForPizzaDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza ingredients: cheese + tomato sauce + chicken + additional cheese", description);
    }
}
