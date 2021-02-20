package Assignment_4;

import java.util.LinkedList;
import java.util.Queue;

public class Reverse_The_Queue {
    public static void Reverse(Queue<Integer> q)
    {
        if(q.isEmpty())
            return;
        int x=q.poll();
        Reverse(q);
        q.add(x);
    }
    public static void print(Queue<Integer> q)
    { for(Integer x: q)
            System.out.print(x+" ");}

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(76);
        q.add(23);
        q.add(42);
        q.add(1);
        q.add(96);
        print(q);
        System.out.println();
        Reverse(q);
        print(q);
    }
}
