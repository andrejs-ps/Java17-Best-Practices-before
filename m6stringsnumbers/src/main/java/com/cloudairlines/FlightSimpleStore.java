package com.cloudairlines;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;

public class FlightSimpleStore {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    public List<Flight> getFlights(String json) {

        List<Flight> flights = null;
        try {
            flights = MAPPER.readValue(json, new TypeReference<>() { });
        } catch (IOException e) {
            // log or rethrow
        }
        return flights;
    }
}
