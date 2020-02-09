package com.kodilla.good.patterns.challenges.flight;

import java.util.HashSet;
import java.util.Set;


public final class FlightDatabase {

    private static Set<Flight> flightSet = new HashSet<>();

    static {
        flightSet.add(new Flight(FlightStations.WARSZAWA, FlightStations.KRAKOW));
        flightSet.add(new Flight(FlightStations.GDANSK, FlightStations.LUBLIN));
        flightSet.add(new Flight(FlightStations.WROCLAW, FlightStations.WARSZAWA));
        flightSet.add(new Flight(FlightStations.LUBLIN, FlightStations.KRAKOW));
        flightSet.add(new Flight(FlightStations.WARSZAWA, FlightStations.WROCLAW));
        flightSet.add(new Flight(FlightStations.KRAKOW, FlightStations.WROCLAW));
        flightSet.add(new Flight(FlightStations.RZESZOW, FlightStations.KRAKOW));
        flightSet.add(new Flight(FlightStations.KRAKOW, FlightStations.WROCLAW));
        flightSet.add(new Flight(FlightStations.RZESZOW, FlightStations.LUBLIN));
        flightSet.add(new Flight(FlightStations.LUBLIN, FlightStations.KRAKOW));

    }

    public static Set<Flight> accessToSet() {
        return new HashSet<>(flightSet);
    }

    @Override
    public String toString() {
        return "FlightDatabase{" +
                "flightSet=" + flightSet +
                '}';
    }

}
