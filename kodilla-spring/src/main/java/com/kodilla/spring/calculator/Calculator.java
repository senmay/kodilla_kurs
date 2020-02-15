package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component

public class Calculator {
    @Autowired

    private Display display;

    public Calculator(Display display) {
        this.display = display;
    }

    public double add (double a, double b) {
        double result = a+b;
        display.displayValue(result);
        return result;
    }

    public double subtract (double a, double b) {
        double result = a-b;
        display.displayValue(result);
        return result;
    }

    public double divide (double a, double b) {
        double result = a/b;
        display.displayValue(result);
        return result;
    }

    public double multiply (double a, double b) {
        double result = a * b;
        display.displayValue(result);
        return result;
    }
}
