package com.cloudairlines.passenger;

import com.cloudairlines.flight.Flight;

import java.util.ArrayList;
import java.util.List;

public class PassengerSearch {

    public List<Passenger> findPassengersBySeatClass(Flight flight, SeatClass seatClass) {
        List<Passenger> passengers = flight.getPassengerList();
        List<Passenger> foundPassengers = new ArrayList<>();
        for(Passenger passenger : passengers) {
            if(passenger.getSeatClass().equals(seatClass)) {
                foundPassengers.add(passenger);
            }
        }
        return foundPassengers;
    }
}
