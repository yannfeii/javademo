package com.sun.exceptionhanding;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExceptionHandlingWithWrapperEx {

    public static void main(String[] args) {
    }

    private static void exceptionHandlingLambda() {

        List<Integer> scores = Arrays.asList(150, 0, 120, 140);

        scores = Arrays.asList(50, 180, 0, 140);
        scores.forEach(score -> {
            try {
                System.out.println(500 / score);
            } catch (ArithmeticException arithmeticException) {
                System.out.println("Check for zero value : " + arithmeticException.getMessage());
            }
        });

        System.out.println("Repetitive code ......");
        Consumer<Integer> scoreConsumer = score -> {
            try {
                System.out.println(500 / score);
            } catch (ArithmeticException arithmeticException) {
                System.out.println("Check for zero value : " + arithmeticException.getMessage());
            }
        };
    }
}
