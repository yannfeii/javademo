package com.sun.interfacedemo;

public class InterfaceWithSameFuncNameImpl implements interfaceWithSameFuncName1,interfaceWithSameFuncName2{

    @Override
    public String[] method() {
        String interfaceString[] = {interfaceWithSameFuncName1.super.method()[0],interfaceWithSameFuncName2.super.method()[0]};
        return interfaceString;
    }

}
