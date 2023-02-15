package com.sun.streamapi;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamforEachDemo {

    public static void main(String[] args){

        String stringList[] ={"Java","Python","Go","Unix","Unix"};
        Stream<String> stringStream = Stream.of(stringList);
        stringStream.forEach(System.out::println);

    }
}
