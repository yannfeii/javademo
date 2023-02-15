package com.sun.threads;

public class WaitNotify extends Thread{

    private long sumUptoMillion;
    private long sumUptoTenMillion;

    public void run(){
        synchronized (this) {
            calculateSumUptoMillion();
            notify();
        }

        calculateSumUptoTenMillion();

    }

    private void calculateSumUptoMillion() {
        for (int i = 0; i < 1000000; i++) {
            sumUptoMillion += i;
        }
        System.out.println("Million done");
    }

    private void calculateSumUptoTenMillion() {
        for (int i = 0; i < 10000000; i++) {
            sumUptoTenMillion += i;
        }
        System.out.println("Ten Million done");
    }

    public static void main(String[] args) throws InterruptedException {
        WaitNotify thread = new WaitNotify();
        synchronized (thread) {
            thread.start();
            thread.wait();
        }
        System.out.println(thread.sumUptoMillion);
    }
}

