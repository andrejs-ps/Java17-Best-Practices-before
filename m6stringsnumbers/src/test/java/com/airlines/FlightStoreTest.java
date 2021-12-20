package com.airlines;

import com.cloudairlines.Flight;
import com.cloudairlines.FlightSimpleStore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FlightStoreTest {

    @Test
    public void testWithoutTextBlock() {
        String json = "[\n" +
                "  {\n" +
                "    \"from\":\"New York\",\n" +
                "    \"to\":\"London\",\n" +
                "    \"date\":\"2022-07-07\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"from\":\"Tokyo\",\n" +
                "    \"to\":\"Singapore\",\n" +
                "    \"date\":\"2022-07-10\"\n" +
                "  }\n" +
                "]";
        var store = new FlightSimpleStore();
        List<Flight> flights = store.getFlights(json);

        Assertions.assertEquals(2, flights.size());
    }

    @Test
    public void testWithTextBlock() {
        String json = """
                [
                  {
                    "from":"New York",
                    "to":"London",
                    "date":"2022-07-07"
                  },
                  {
                    "from":"Tokyo",
                    "to":"Singapore",
                    "date":"2022-07-10"
                  }
                ]
                """;
        var store = new FlightSimpleStore();
        List<Flight> flights = store.getFlights(json);

        Assertions.assertEquals(2, flights.size());
    }
}
