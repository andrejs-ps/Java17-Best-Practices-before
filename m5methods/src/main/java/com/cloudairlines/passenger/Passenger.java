package com.cloudairlines.passenger;

public class Passenger {

    String surname;
    String seatClass;

    public Passenger(String surname, String seatClass) {
        this.surname = surname;
        this.seatClass = seatClass;
    }

    public String getSurname() {
        return surname;
    }

    public String getSeatClass() {
        return seatClass;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "surname='" + surname + '\'' +
                ", seatClass='" + seatClass + '\'' +
                '}';
    }
}
