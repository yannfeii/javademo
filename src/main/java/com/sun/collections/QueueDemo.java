package com.sun.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args){

        Queue queue =  new LinkedList();

        for(int i=1; i<6;i++){
          boolean offer = queue.offer(i*11);
        }

        System.out.println("queue"+queue);

        Object peek = queue.peek();
        System.out.println("queue.peek()"+peek);
        System.out.println("queue"+queue);

        Object poll = queue.poll();
        System.out.println("queue.peek()"+poll);
        System.out.println("queue"+queue);

    }
}
