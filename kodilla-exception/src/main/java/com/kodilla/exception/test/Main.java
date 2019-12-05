package com.kodilla.exception.test;

public class Main {

    public static void main(String[] args) {
        Flight flight = new Flight("Krakow","Okecie");
        SrFlight flightSearch = new SrFlight();

        try{
            flightSearch.findFilght(flight);
        } catch(RouteNotFoundException e) {
            System.out.println(e);
        }
    }
}