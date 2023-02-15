package com.sun.lambdaexpress;

public  interface  NoArgumentInterface {

    void show();
    default void testDefault(){
        System.out.println("default");
    }

    static void testStatic(){
        System.out.println("Static");
    }
}
