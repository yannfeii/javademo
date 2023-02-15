package com.sun.interfacedemo;
import java.util.Arrays;

public class InterfaceWithSameFuncNameTest {

    //it will get compile error when doesn't override method()
    public static void main(String[] args){
        InterfaceWithSameFuncNameImpl interfaceWithSameFuncNameImpl = new InterfaceWithSameFuncNameImpl();
        String results[] = interfaceWithSameFuncNameImpl.method();
        Arrays.asList(results).forEach(list ->{System.out.println(list);});
    }
}
