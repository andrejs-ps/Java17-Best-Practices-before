package com.cloudairlines.flight;

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

    public List<Flight> search(String fromDest, String toDest, String departDate){
        List<Flight> availableFlights = flightStore.getFlights();

        // we'll implement the search later
        return availableFlights;
    }
}
