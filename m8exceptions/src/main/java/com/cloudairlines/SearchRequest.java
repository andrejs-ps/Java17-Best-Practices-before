package com.cloudairlines;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Objects;

import static java.time.format.DateTimeFormatter.*;

public class SearchRequest {

    private String from;
    private String to;
    private LocalDate date;


    public SearchRequest(String[] args) {
        this(args[0], args[1], args[2]);
    }

    public SearchRequest(String from, String to, String date) {
        this.from = Objects.requireNonNull(from);
        this.to = Objects.requireNonNull(to);
        this.date = parseDate(date);
    }

    private LocalDate parseDate(String departDate) {
        return LocalDate.parse(departDate, ofPattern("yyy-MM-dd"));
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    /**
     * @return the date of the Search Request
     */
    public LocalDate getDate() {
        return date;
    }
}
