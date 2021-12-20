package com.cloudairlines.passenger;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class SearchRequest {

    private String fromDestination;
    private String toDestination;
    private String departDate;


    public SearchRequest(String[] args) {
        if(args.length != 3) {throw new IllegalArgumentException("There should be exactly 3 arguments provided");}
        this.toDestination = isInvalidString(args[0]);
        this.fromDestination = isInvalidString(args[1]);
        this.departDate = args[2];

        if(fromDestination.equalsIgnoreCase(toDestination)){
            throw new IllegalArgumentException("From and To Destinations cannot be the same. You input " + fromDestination);
        }

    }

    private LocalDate validateDate(String stringDate) {
        String date = isInvalidString(stringDate);
        return parseInputDate(date);
    }

    public String getFrom() {
        return fromDestination;
    }

    public String getTo() {
        return toDestination;
    }

    public String getDate() {
        return departDate;
    }


    private LocalDate parseInputDate(String departDate) {
        LocalDate date;

        try {
            date = LocalDate.parse(departDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        } catch (DateTimeParseException exception){
            // or display a user-friendly message on the UI
            throw new IllegalArgumentException(String.format("Could not parse input date %s, please input a date in format dd-MM-YYYY", departDate));
        }
        return date;
    }

    private String isInvalidString(String s){
        if(s == null || s.trim().isEmpty()){
            throw new IllegalArgumentException("You have provided the following argument, but it cannot be null or empty:" + s);
        }
        return s;
    }
}
