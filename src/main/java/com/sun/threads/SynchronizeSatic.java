package com.sun.threads;

public class SynchronizeSatic {

    private static int count = 10;

    //下面两个方法是等值的
    public synchronized static void function(){//synchronized (Synchronize.class)
        count --;
        System.out.println(Thread.currentThread().getName() + " count = "+count);
    }

    public static void function2(){
        synchronized(Synchronize.class){
            count --;
            System.out.println(Thread.currentThread().getName() + " count = "+count);
        }
    }
}
