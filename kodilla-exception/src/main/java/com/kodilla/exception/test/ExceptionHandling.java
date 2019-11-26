package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String s = secondChallenge.probablyIWillThrowException(1, 3);
            System.out.println("Result: " + s);

            s = secondChallenge.probablyIWillThrowException(0, 1.5);
            System.out.println("Result:  " + s);

        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            System.out.println("The End");
        }
    }
}