package com.cloudairlines.flight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Objects;

public class SearchRequest {

    private String from;
    private String to;
    private LocalDate date;

    public SearchRequest(String[] args) {
        this(args[0], args[1], args[2]);
    }

    public SearchRequest(String from, String to, String date) {
        if (from.equalsIgnoreCase(to)) {
            throw new IllegalArgumentException("'From' and 'To' cannot be the same. You input '" + from + "'");
        }
        this.from = Objects.requireNonNull(from);
        this.to = Objects.requireNonNull(to);
        this.date = parseDate(date);
    }

    private LocalDate parseDate(String departDate) {
        LocalDate date;

        try {
            date = LocalDate.parse(departDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        } catch (DateTimeParseException exception) {
            throw new IllegalArgumentException(String.format("Failed to parse input date %s, expected format is yyyy-MM-dd", departDate));
        }
        return date;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public LocalDate getDate() {
        return date;
    }
}
