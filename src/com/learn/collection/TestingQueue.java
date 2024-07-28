package com.learn.collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestingQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.offer(2);
       /* for (Integer i : queue) {
            System.out.printf("%d ", i);
        }*/
        Utility.print(queue);
        System.out.println(queue.peek());    // it is retrieve the element
        System.out.println(queue.element());  // it is retrieve the element

        System.out.println(queue.remove());
        Utility.print(queue);
        System.out.println(queue.poll());   // it is also remove the element
        Utility.print(queue);
        System.out.println(queue.poll());

    }
}
