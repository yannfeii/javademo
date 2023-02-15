package com.sun.streamapi;

import java.util.*;
import java.util.stream.Stream;

public class StreamMethod {

    public static void main(String[] args){

        //Collection
        Stream<Integer> arraylistStream = new ArrayList<Integer>().stream();
        Stream<Integer> hashSetStream = new HashSet<Integer>().stream();
        Stream<Integer> vectorStream = new Vector<Integer>().stream();

        //Map
        HashMap<String,String> hashMap = new HashMap<>();
        Stream<String> keySetStream = hashMap.keySet().stream();
        Stream<String> valuesStream = hashMap.values().stream();
        Stream<Map.Entry<String, String>> entrySetStream = hashMap.entrySet().stream();


    }
}
