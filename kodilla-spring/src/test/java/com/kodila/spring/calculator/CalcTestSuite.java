package com.kodila.spring.calculator;

import com.kodilla.spring.calculator.Calculator;
import com.kodilla.spring.calculator.Display;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)

@SpringBootTest (classes = {Calculator.class, Display.class})
public class CalcTestSuite {
    @Test
    public void testCalculations() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //when
        double add = calculator.add(2, 2);
        double sub = calculator.subtract(10, 3);
        double mul = calculator.multiply(5, 10);
        double div = calculator.divide(12, 4);

        //then
        Assert.assertEquals(4, add, 0);
        Assert.assertEquals(7, sub, 0);
        Assert.assertEquals(50, mul, 0);
        Assert.assertEquals(3, div, 0);
    }
}
