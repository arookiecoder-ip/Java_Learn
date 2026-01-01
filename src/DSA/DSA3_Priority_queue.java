package DSA;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class DSA3_Priority_queue {
    static void main() {
//        Priority Queue = A FIFO data structure that serves elements
//        with the highest priorities first
//        before elements with lower priority


        Queue<Double> queue = new PriorityQueue<>();  //orders the elements in the queue
        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }

    }
}
