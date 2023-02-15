package com.sun.interfacedemo;

public interface interfaceWithSameFuncName2 {

    default String[] method(){
        return new String[]{"This is interface2 method"};
    }
}
