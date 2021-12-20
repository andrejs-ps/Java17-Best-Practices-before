package com.cloudairlines;


import com.cloudairlines.flight.Flight;
import com.cloudairlines.flight.FlightSearch;
import com.cloudairlines.passenger.SearchRequest;

import java.util.List;

public class SearchServiceMain {

    public static void main(String[] args) {

        var request = new SearchRequest(new String[]{"London", "New York", "2022-10-15"});
        FlightSearch searchService = FlightSearch.newSearch();

        List<Flight> foundFlights = searchService.search(request);

        foundFlights.forEach(System.out::println);

    }
}
