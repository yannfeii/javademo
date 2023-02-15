package com.sun.threads;

public class Synchronize {

    private int count = 10;
    private Object obj = new Object();

    public void function(){
        synchronized (obj){//任何线程要执行下面的代码，必须拿到obj的锁
            count --;
            System.out.println(Thread.currentThread().getName() + " count = "+count);
        }
    }



}
