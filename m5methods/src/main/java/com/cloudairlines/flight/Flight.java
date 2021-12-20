package com.cloudairlines.flight;


import com.cloudairlines.passenger.Passenger;
import com.cloudairlines.airport.Airport;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Flight {

    private Airport fromAirport;
    private Airport toAirport;

    @JsonProperty("from")
    private String fromCity;
    @JsonProperty("to")
    private String toCity;
    @JsonProperty("date")
    private String date;

    private int seatCapacity;
    private List<Passenger> passengerList;

    public Flight() {}
    public Flight(String fromCity, String toCity, String date) {
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.date = date;
    }


    public Flight(Airport fromAirport, Airport toAirport, String date, List<Passenger> passengerList) {
        this.fromAirport = fromAirport;
        this.fromCity = fromAirport.city();

        this.toAirport = toAirport;
        this.toCity = toAirport.city();

        this.date = date;
        this.passengerList = passengerList;
        this.seatCapacity = 150;
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "fromCity='" + fromCity + '\'' +
                ", toCity='" + toCity + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
