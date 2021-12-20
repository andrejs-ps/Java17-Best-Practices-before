package com.cloudairlines;

import java.time.LocalDateTime;

public class ConditionalCheckMain {

    public static void main(String[] args) {

        int hour = LocalDateTime.now().getHour();

        if(hour > 6 && hour < 22) {
            // display day shift flights
        } else {
            // display night shift flights
        }
    }
}
