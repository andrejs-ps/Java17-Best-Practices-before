package com.cloudairlines;

public class SwitchesMain {


    public static void main(String[] args) {

        var passenger = new Passenger(SeatClass.ECONOMY);

        switch (passenger.seatClass) {
            case ECONOMY:
                System.out.println("Basic meal");
            case BUSINESS:
                System.out.println("Meal + dessert");
            case FIRST:
                System.out.println("Meal + dessert + champagne");
        }
    }

    enum SeatClass {
        ECONOMY, BUSINESS, FIRST
    }
    public static class Passenger {
        SeatClass seatClass;
        public Passenger(SeatClass seatClass) {
            this.seatClass = seatClass;
        }
    }
}
