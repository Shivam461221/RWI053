package com.mycompany.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();

        System.out.println(q.peek());  //returns the top element if queue empty return null
        //System.out.println(q.element());//return top element throw NoSuchElementException if queue is empty

        for (int i = 10; i <= 20; i++) {
            q.offer(i); //to insert elements in queue
        }
        System.out.println(q);

        System.out.println(q.poll()); //poll method removes the element from queue if queue is empty it will return null

        System.out.println(q);

        System.out.println(q.remove()); // similar to poll bur throws exception if queue is empty

        System.out.println(q);
    }
}
