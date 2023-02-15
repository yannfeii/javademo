package com.sun.streamapi;

import java.util.stream.Stream;

public class StreamCountDemo {

    public static void main(String[] args){

        Stream<String> stringStream = Stream.of("Java","Python","Go","Unix","Unix");
        System.out.println(stringStream.count());


    }
}
