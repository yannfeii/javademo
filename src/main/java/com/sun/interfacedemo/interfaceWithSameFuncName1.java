package com.sun.interfacedemo;

public interface interfaceWithSameFuncName1 {

    default String[] method(){
        return new String[]{"This is interface1 method"};
    }
}
