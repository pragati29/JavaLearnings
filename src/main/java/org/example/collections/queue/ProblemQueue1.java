package org.example.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ProblemQueue1 {
    public static void main(String[] args) {
        Deque<String> deque=new ArrayDeque<>();
         deque.addFirst("A");
         deque.addLast("B");
         deque.addFirst("C");
        System.out.println(deque.poll());
    }
}
