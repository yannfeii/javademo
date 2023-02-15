package com.sun.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectDemo {

    public static void main(String[] args){

        String stringList[] ={"Java","Python","Go","Unix","Unix"};
        Stream<String> stringStream = Stream.of(stringList);
        Set<String> results = stringStream.filter(f->f.startsWith("U")).collect(Collectors.toSet());
        Arrays.asList(results).forEach(System.out::println);

    }
}
