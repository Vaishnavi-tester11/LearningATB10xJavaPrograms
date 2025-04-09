package ex_23_Collection_frameworks.Queue;

import java.util.PriorityQueue;

public class Lab_241_Queue {
    public static void main(String[] args) {
        PriorityQueue q=new PriorityQueue();
        q.add("Vaishnavi");
        q.offer("Bindu");
        q.add("Reddy");
        q.offer("Ahaana");
        //q.offer(1234);
        //q.offer(4567);
        q.offer("Vaishnavi");
        q.offer("Ahaana");
        System.out.println(q);

        //  Queue -> First in First Out
        // offer -> add
        // peek -> see the first element(FIFO)
        // poll -> delete the first element

        System.out.println(q.peek()); //see the first element
        System.out.println(q.poll());  // delete the first element
        System.out.println(q);



    }
}
