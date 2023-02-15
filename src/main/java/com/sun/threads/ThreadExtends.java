package com.sun.threads;

public class ThreadExtends extends Thread{

    public void run() {
        for (int i = 0; i < 1000; i++)
            System.out.println("Running Thread extends "+ i);
    }


}
