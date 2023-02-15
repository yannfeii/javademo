package com.sun.threads;

public class SynchronizeDemo implements Runnable{

    private int count = 10;

    public synchronized void run(){
        count--;
        System.out.println(Thread.currentThread().getName() + " count = "+count);
    }

    public static void main(String[] args){

        for(int i=0; i<5; i++){
            SynchronizeDemo synchronizeDemo = new SynchronizeDemo();
            new Thread(synchronizeDemo,"Thread "+i).start();
        }
    }



}
