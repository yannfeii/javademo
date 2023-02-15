package com.sun.threads;

public class ThreadInterface implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++)
            System.out.println("Running Thread implements "+ i);
    }
}
