package com.cloudairlines;

import org.junit.jupiter.api.Test;

import java.util.List;

public class FlightSearchServiceTest {

    @Test
    public void quickFlightSearchTest() {
        var search = new FlightSearchService();
        List<Flight> flights = search.search("London", "Paris", "2022-07-22");
        // assert things
    }
}
