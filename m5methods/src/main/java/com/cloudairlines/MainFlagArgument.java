package com.cloudairlines;

import com.cloudairlines.flight.Flight;
import com.cloudairlines.flight.FlightStoreImpl;
import com.cloudairlines.passenger.PassengerSearch;

public class MainFlagArgument {


    public static void main(String[] args) {
        PassengerSearch paxSearch = new PassengerSearch();
        Flight flight = new FlightStoreImpl().getFlights().get(0);

        System.out.println("====== Economy ======");
        paxSearch
                .findEconomyPassengers(flight, true)
                .forEach(System.out::println);

        System.out.println("====== Non-Economy ======");
        paxSearch
                .findEconomyPassengers(flight, false)
                .forEach(System.out::println);
    }
}
