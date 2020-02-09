package com.kodilla.good.patterns.challenges.flight;

public class Main {
    public static void main(String[] args) {

        FlightFinder flightFinder=new FlightFinder();
        flightFinder.findAllFlightsFromPrint(FlightStations.WARSZAWA);
        flightFinder.findAllFlightsToPrint(FlightStations.LUBLIN);
        flightFinder.findFlightWithChange(FlightStations.KRAKOW, FlightStations.WARSZAWA);

    }
}
