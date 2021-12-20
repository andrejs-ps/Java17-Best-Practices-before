package com.cloudairlines.flight;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FlightSearch {

    private FlightStore flightStore;

    public FlightSearch(FlightStore store) {
        this.flightStore = Objects.requireNonNull(store);
    }

    public static FlightSearch newSearch() {
        return new FlightSearch(new FlightStoreImpl());
    }


    public List<Flight> search(SearchRequest request) {

        if (request == null) {
            throw new IllegalArgumentException("Request cannot be null");
        }

        List<Flight> availableFlights = flightStore.getFlights();

        String from = request.getFrom();
        String to = request.getTo();
        LocalDate date = request.getDate();

        List<Flight> foundFlights = new ArrayList<>();

        for (Flight flight : availableFlights) {
            if (flight.getFromCity().equals(from) &&
                    flight.getToCity().equals(to) &&
                    flight.getDate().equals(date.toString())) {
                    foundFlights.add(flight);
            }
        }

        return availableFlights.stream()
                .filter(f -> f.getFromCity().equals(from))
                .filter(f -> f.getToCity().equals(to))
                .filter(f -> f.getDate().equals(date.toString()))
                .toList();
    }
}
