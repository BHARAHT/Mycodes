package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_Imp {
    public static void main(String[] args) {
        Deque <Integer> deque=new ArrayDeque<Integer>();
        deque.addLast(10);
        deque.addLast(9);
        deque.addLast(8);
        deque.addLast(7);
        System.out.println("Dequeue Data is :"+deque);
        deque.removeLast();
        System.out.println("Dequeue Data is :"+deque);

    }
}
