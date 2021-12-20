package com.cloudairlines.airport;

import java.util.List;

public class AirportStore {

    public static final Airport NEW_YORK_JFK = new Airport("USA", "New York", "JFK", List.of(1, 2, 3));
    public static final Airport LONDON_GATWICK = new Airport("UK", "London", "Gatwick", List.of(1, 2, 3));
    public static final Airport PARIS_CDG = new Airport("France", "Paris", "Charles De Gaulle", List.of(1, 2));
}
