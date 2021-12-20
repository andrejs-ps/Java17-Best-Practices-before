package com.cloudairlines;

public class SearchRequestDemo {

    public static void main(String[] args) {

        String[] searchInputs = {"From", "To", "50-60-70"};

        var request = new SearchRequest(searchInputs);

    }
}
