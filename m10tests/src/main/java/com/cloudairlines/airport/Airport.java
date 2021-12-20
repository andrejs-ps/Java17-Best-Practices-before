package com.cloudairlines.airport;

import java.util.List;


public record Airport(String country, String city, String name, List<Integer> terminals) {

}
