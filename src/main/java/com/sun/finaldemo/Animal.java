package com.sun.finaldemo;

public class Animal{

    private final String FEMALE = "F";
    private final String MALE;
    Animal(){
        MALE = "M";
    }

    static final int MAXAGE = 80;
    static final int MINAGE;
    static {
        MINAGE = 1;
    }

    public final void sleep(){
        System.out.println("animal need to sleep");
    }

    public void sleep(final int time){
        final String place = "home";

        final String otherPlace;
        otherPlace = getPlace();

        System.out.println("animal need to "+ place +" sleep " + time + " hours");
        //time = 8;//只能在调用的时候赋值，不可再方法里赋值

        System.out.println("animal need to "+ otherPlace +" sleep " + time + " hours");
    }

    private String getPlace(){
        return "homme home";
    }
}
