package com.sun.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamApiEx {

    public static void main(String[] args) {

        int[] numbers = new int[500];
        for (int index = 0; index < 500; index++) {
            numbers[index] = index + 1;
        }
        // Intermediate operations
        IntStream intStream = Arrays.stream(numbers);
        OptionalInt optionalInt = intStream.min();
        //optionalInt.getAsInt() will return Integer type
        optionalInt.getAsInt();




//        List<Integer> integerList = Arrays.asList(numbers);
//
//
//        IntStream intStreams = integerList.stream().mapToInt(Integer::intValue);
//        // min is a terminal operation
//        // reverses and produces a result.this stream is considered as CONSUMED, cannot be used again
//        // the operation did not modify this source
//        // Return the source to get a new stream
//        OptionalInt optionalInt = intStream.min();
//        System.out.println(optionalInt.getAsInt());
    }
}