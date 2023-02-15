package com.sun.lambdaexpress;

public class ThreadDemo {

    public static void main(String[] args){
        //1. implement Runnable interface
//        Runnable runnable = new MyRunnable();
//        Thread thread = new Thread(runnable);
//        thread.start();

        //2. 匿名内部类
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类 thread start");
            }
        });
        thread.start();

        //3. lambda express
        new Thread(() -> {
            System.out.println("lambda thread start");
        }).start();

        new Thread(() -> System.out.println("lambda thread start")).start();
    }
}
