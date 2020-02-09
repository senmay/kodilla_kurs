package com.kodilla.good.patterns.challenges.flight;

public class Flight {

    private FlightStations flightFrom;
    private FlightStations flightTo;

    public FlightStations getFlightFrom() {
        return flightFrom;
    }

    public FlightStations getFlightTo() {
        return flightTo;
    }


    public Flight(FlightStations flightFrom, FlightStations flightTo) {
        this.flightFrom = flightFrom;
        this.flightTo = flightTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (flightFrom != flight.flightFrom) return false;
        return flightTo == flight.flightTo;
    }

    @Override
    public int hashCode() {
        int result = flightFrom.hashCode();
        result = 31 * result + flightTo.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightFrom='" + flightFrom + '\'' +
                ", flightTo='" + flightTo + '\'' +
                '}';
    }
}
