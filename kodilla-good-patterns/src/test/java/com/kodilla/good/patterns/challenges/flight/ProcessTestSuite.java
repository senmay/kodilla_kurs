package com.kodilla.good.patterns.challenges.flight;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;
@RunWith(JUnit4.class)
public class ProcessTestSuite {

        @Test
        public void testfindAllFlightsFrom() {
            //Given
            FlightFinder flightFinder = new FlightFinder();

            //When
            List<FlightStations> result = flightFinder.findAllFlightsFrom(FlightStations.WARSZAWA);

            //Then
            Assert.assertTrue(result.contains(FlightStations.KRAKOW));
            Assert.assertTrue(result.contains(FlightStations.WROCLAW));

        }
        @Test
        public void testfindAllFlightsTo() {
            //Given
            FlightFinder flightFinder = new FlightFinder();

            //When
            List<FlightStations> result = flightFinder.findAllFlightsTo(FlightStations.LUBLIN);

            //Then
            Assert.assertTrue(result.contains(FlightStations.GDANSK));
            Assert.assertTrue(result.contains(FlightStations.RZESZOW));

        }

        @Test
        public void testFindFlightWithChange() { //finding where is change between airports
            //Given
            FlightFinder flightFinder = new FlightFinder();

            //When
            List<FlightStations> result = flightFinder.findFlightWithChange(FlightStations.KRAKOW, FlightStations.WARSZAWA);

            //Then
            Assert.assertTrue(result.contains(FlightStations.WROCLAW));


        }












    }

