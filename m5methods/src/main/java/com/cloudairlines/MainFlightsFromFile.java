package com.cloudairlines;

import com.cloudairlines.flight.Flight;
import com.cloudairlines.flight.FlightSimpleStore;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MainFlightsFromFile {

    public static void main(String[] args) {
        String path = "m5methods/src/main/resources/flights.json";

        String content = readFileBufferedReader(path);

        FlightSimpleStore store = new FlightSimpleStore();

        List<Flight> flights = store.getFlights(content);
        flights.forEach(System.out::println);
    }

    public static String readFileBufferedReader(String path) {
        BufferedReader objReader = null;
        String fileContent = "";
        try {
            String strCurrentLine;
            objReader = new BufferedReader(new FileReader(path));
            while ((strCurrentLine = objReader.readLine()) != null) {
                // concat in a loop - will fix in next module
                fileContent += strCurrentLine;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

            if (objReader != null) {
                try {
                    objReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
        return fileContent;
    }
}
