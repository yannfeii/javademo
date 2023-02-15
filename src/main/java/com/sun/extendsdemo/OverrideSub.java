package com.sun.extendsdemo;

public class OverrideSub extends OverrideBase{

    String name = "This is sub class";
    public void showName(){
        System.out.println(this.name);
    }

    public void getParentName(){
        System.out.println("getParentName: "+super.name);
    }

    public void doSupper(){
        super.showName();
    }

    public void doThis(){
        this.showName();
    }

}
