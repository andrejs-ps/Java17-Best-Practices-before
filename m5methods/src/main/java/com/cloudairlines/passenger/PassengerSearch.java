package com.cloudairlines.passenger;

import com.cloudairlines.flight.Flight;

import java.util.ArrayList;
import java.util.List;

public class PassengerSearch {

    public List<Passenger> findEconomyPassengers(Flight flight, boolean economy) {

        List<Passenger> foundPassengers = new ArrayList<>();

        for(Passenger passenger : flight.getPassengerList()){
            if(economy){
                if(passenger.getSeatClass().equals("Economy")) {
                    foundPassengers.add(passenger);
                }
            } else {
                if(!passenger.getSeatClass().equals("Economy")) {
                    foundPassengers.add(passenger);
                }
            }
        }
        return foundPassengers;
    }
}
