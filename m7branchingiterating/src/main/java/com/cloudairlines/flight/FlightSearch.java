package com.cloudairlines.flight;

import com.cloudairlines.passenger.SearchRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FlightSearch {

    private FlightStore flightStore;

    public FlightSearch(FlightStore store){
        this.flightStore = Objects.requireNonNull(store);
    }

    public static FlightSearch newSearch() {
        return new FlightSearch(new FlightStoreImpl());
    }

    public List<Flight> search(String from, String to, String date) {

        return null;
    }

    public List<Flight> search(SearchRequest request) {

        if(request == null) {
            throw new IllegalArgumentException("Request cannot be null");
        }

        List<Flight> availableFlights = flightStore.getFlights();

        String from = request.getFrom();
        String to = request.getTo();
        String date = request.getDate();
        List<Flight> foundFlights = new ArrayList<>();

        // implement the search
        return availableFlights;
    }
}
