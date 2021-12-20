package com.cloudairlines;


public class Flight {

    private String fromDest;
    private String toDest;
    private String date;

    public Flight(String fromDest, String toDest, String date) {
        this.fromDest = fromDest;
        this.toDest = toDest;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "fromDest='" + fromDest + '\'' +
                ", toDest='" + toDest + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
