package com.sun.lambdaexpress;

import java.util.ArrayList;

public class LambdaDemoCompact {

    public static void main(String[] args) {
        ArrayList locations = new ArrayList<>();
        locations.add("place 1");
        locations.add("place 2");

        locations.forEach((location) -> {
            System.out.println("this is the location " + location);

        });

        locations.forEach(System.out::println);

        locations.forEach(loc -> {
            if (loc != null) System.out.println("this is the loc " + loc.toString().toUpperCase());

        });

    }


}
