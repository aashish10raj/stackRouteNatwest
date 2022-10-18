package com.natwest.learning.queueex;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueImpl {
    public static void main(String[] args) {
        Queue<String> queue=new PriorityQueue<>();
//        queue.add(" ");
//        queue.remove();
//        System.out.println(queue.poll());
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Carrot");
        queue.offer("orange");
        queue.offer("Pomegranate");

        System.out.println("Head Element : "+queue.peek());
        queue.poll();
        for(String s:queue){
            System.out.println(s);
        }

    }
}
