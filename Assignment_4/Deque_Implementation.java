package Assignment_4;

import java.util.Deque;
import java.util.LinkedList;

public class Deque_Implementation {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<Integer>();
        d.offerFirst(9);
        d.offerLast(10);
        d.offerFirst(5);
        d.offer(18);
        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());
        d.pollFirst();
        d.pollLast();
    }
}
