package com.kodilla.good.patterns.challenges.flight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class FlightFinder {

    public List<FlightStations> findAllFlightsFrom(FlightStations flightFrom) {
        List<FlightStations> flightsFrom = FlightDatabase.accessToSet().stream()
                .filter(flight -> flight.getFlightFrom().equals(flightFrom))
                .map(flight -> flight.getFlightTo())
                .collect(Collectors.toList());
        return flightsFrom;
    }

    public void findAllFlightsFromPrint(FlightStations flightFrom) {
        System.out.println("From " + flightFrom + " you can fly to -> " + findAllFlightsFrom(flightFrom));
    }

    public List<FlightStations> findAllFlightsTo(FlightStations flightTo) {
        List<FlightStations> flightsTo = FlightDatabase.accessToSet().stream()
                .filter(flight -> flight.getFlightTo().equals(flightTo))
                .map(flight -> flight.getFlightFrom())
                .collect(Collectors.toList());
        return flightsTo;
    }

    public void findAllFlightsToPrint(FlightStations flightTo) {
        System.out.println("To " + flightTo + " you can fly from <- " + findAllFlightsTo(flightTo));
    }

    public List<FlightStations> findFlightWithChange(FlightStations flightFrom, FlightStations flightTo) {
        List<FlightStations> flightsFromCity = findAllFlightsFrom(flightFrom);
        List<FlightStations> flightsToCity = findAllFlightsTo(flightTo);


        List<FlightStations> list = new ArrayList<>();
        for (FlightStations fly : flightsFromCity) {

            if (flightsToCity.contains(fly)) {
                list.add(fly);
            }
        }
        return list;
    }

    public void findFlightWithChangeToPrint(FlightStations flightFrom, FlightStations flightTo) {
        System.out.println(findFlightWithChange(flightFrom, flightTo));
    }
}
