package com.sun.threads;

public class SynchronizeFunc {

    private int count = 10;
    //下面两个方法是等值的
    public synchronized void function(){//锁住当前对象
        count --;
        System.out.println(Thread.currentThread().getName() + " count = "+count);
    }

    public void function2(){
        synchronized (this){//锁住当前对象
            count --;
            System.out.println(Thread.currentThread().getName() + " count = "+count);
        }
    }

    public static void main(String[] args){
        SynchronizeFunc synchronizeFunc = new SynchronizeFunc();
        synchronizeFunc.function();
    }
}
