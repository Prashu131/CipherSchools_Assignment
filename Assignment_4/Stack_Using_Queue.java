package Assignment_4;

import java.util.LinkedList;
import java.util.Queue;

public class Stack_Using_Queue {
    static Queue<Integer> q1= new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();
    public static int peek(){
        return (q1.isEmpty())?0:(q1.peek());
    }
    public static int size()
    {
        return q1.size();
    }
    public static  int pop()
    {
        return q1.remove();
    }
    public static void push(int x)
    {
        while(!q1.isEmpty())
        {
            q2.add(q1.peek());
            q1.remove();
        }
        q1.add(x);
        while(!q2.isEmpty())
        {
            q1.add(q2.peek());
            q2.remove();
        }
    }
    public static void main(String[] args)
    {
        push(5);
        push(11);
        push(16);
        push(12);
        System.out.println(pop());
        System.out.println(size());
        System.out.println(peek());
    }
}
