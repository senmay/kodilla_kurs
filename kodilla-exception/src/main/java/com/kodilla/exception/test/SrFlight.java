package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SrFlight {

    public void findFilght(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airport = new HashMap<>();
        airport.put("Rio de Janerio", true);
        airport.put("Krakow", true);
        airport.put("Croatia", true);
        airport.put("Germany", true);
        airport.put("Wlochy", true);

        if(airport.containsKey(flight.getArrivalAirport())) {
            System.out.println("Arrival possible: " + flight.getArrivalAirport());
        }
        else
            throw new RouteNotFoundException("No airport");

    }
}