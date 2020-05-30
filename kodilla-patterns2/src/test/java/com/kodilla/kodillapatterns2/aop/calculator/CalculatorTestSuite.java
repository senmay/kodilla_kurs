package com.kodilla.kodillapatterns2.aop.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    private Calculator calculator;
    public static final Logger LOGGER = LoggerFactory.getLogger(CalculatorTestSuite.class);

    @Test
    public void testAdd() {
        //When
        double result = calculator.add(10, 15);
        //Then
        LOGGER.info("Testing add method");
        assertEquals(25, result, 0);
    }

    @Test
    public void testSub() {
        //Given
        //When
        double result = calculator.sub(10, 15);
        //Then
        LOGGER.info("Testing sub method");
        assertEquals(- 5, result);
    }

    @Test
    public void testDiv() {
        //Given
        //When
        double result = calculator.div(15,5);
        //Then
        LOGGER.info("Testing div method");
        assertEquals(3,result);
    }

    @Test
    public void testFactorial(){
        //Given
        //When
        BigDecimal result = calculator.factorial(new BigDecimal("125"));
        //Then
        LOGGER.info("Testing factorial method");
        System.out.println(result);
        assertTrue(BigDecimal.ONE.compareTo(result)<0);
    }

}