package DSA;

import java.util.Queue;
import java.util.LinkedList;

public class DSA2_Queue1 {
    static void main() {


//        Queue = FIFO data structure. First-In First-Out (ex. A line of people)
//        A collection designed for holding elements before processing
//        Linear data structure
//        add = enqueue, offer()
//        remove = dequeue, poll()

        Queue<String> queue = new LinkedList<String>();

        System.out.println(queue.isEmpty());//to check if the queue is empty or not



        queue.offer("karen");
        queue.offer("chad");
        queue.offer("Steve");
        queue.offer("harold"); //adding elements in queue

        System.out.println(queue);

        System.out.println(queue.size());

        System.out.println(queue.contains("harold"));

        System.out.println(queue.peek()); //finding the top element

        queue.poll();//removing the top element


        System.out.println(queue);
    }
}
