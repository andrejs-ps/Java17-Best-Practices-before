package com.cloudairlines.flight;

import com.cloudairlines.passenger.Passenger;

import java.util.List;

import static com.cloudairlines.airport.AirportStore.*;

public class FlightStoreImpl implements FlightStore {

    public List<Flight> getFlights() {

        return List.of(
                new Flight(LONDON_GATWICK, NEW_YORK_JFK, "2022-10-15", PASSENGER_LIST),
                new Flight(LONDON_GATWICK, NEW_YORK_JFK, "2022-11-15", PASSENGER_LIST),
                new Flight(LONDON_GATWICK, PARIS_CDG, "2022-11-20", PASSENGER_LIST)
        );
    }

    private static final List<Passenger> PASSENGER_LIST = List.of(
            new Passenger("Smith", "Economy"),
            new Passenger("Jones","Economy"),
            new Passenger("Taylor","Economy"),
            new Passenger("Brown","First"),
            new Passenger("Evans","Business")
    );
}
