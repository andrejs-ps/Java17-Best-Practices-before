package com.cloudairlines;


import com.cloudairlines.flight.Flight;
import com.cloudairlines.flight.FlightSearch;

import java.util.List;

public class MainSearchService {

    public static void main(String[] args) {

        FlightSearch searchService = FlightSearch.newSearch();

        List<Flight> foundFlights =
                searchService.search("London", "New York", "2022-10-15");

    }
}
