package com.sun.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMapDemo {

    public static void main(String[] args) {

        String stringList[] = {"Java", "Python", "Go", "JS"};
        Stream<String> stringStream = Stream.of(stringList);
        List<String> results = stringStream.map(m -> m + " learning").collect(Collectors.toList());
        Arrays.asList(results).forEach(System.out::println);

    }
}
