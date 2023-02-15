package com.sun.streamapi;

import java.util.stream.Stream;

public class StreamOfDemo {

    public static void main(String[] args){

        // of 方法
        Stream<Integer> streamOfMethod1 = Stream.of(1,2,1);
        System.out.println("streamOfMethod1" + streamOfMethod1);

        // 接收数组
        String stringList[] ={"Java","Python","Go"};
        Stream<String> stringStream = Stream.of(stringList);
        System.out.println("stringStream" + stringStream);

    }
}
