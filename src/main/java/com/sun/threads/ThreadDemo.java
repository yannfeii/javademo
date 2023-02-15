package com.sun.threads;

public class ThreadDemo {

    public static void main(String[] args){

        ThreadExtends threadExtends = new ThreadExtends();
        System.out.println(threadExtends.getState());
        threadExtends.start();

        ThreadInterface threadInterface = new ThreadInterface();
        Thread thread = new Thread(threadInterface);
        thread.start();

        thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println(thread.getState());

    }
}
