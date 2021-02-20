package Assignment_4;

import java.util.Queue;
import java.util.Stack;

public class Get_Min {
    static Stack<Integer> ms = new Stack<>();
    static Stack<Integer> as = new Stack<>();
    public static void push(int x)
    {
        if(ms.isEmpty() ) {
            ms.add(x);
            as.add(x);
            return;
        }
        ms.push(x);
        if(ms.peek()<=as.peek())
            as.push(x);
    }
    public static void pop()
    {
        if(ms.pop()==as.pop())
            as.pop();
        ms.pop();
    }
    public static int min()
    {
        return as.peek();
    }

    public static void main(String[] args) {
        push(21);
        push(21);
        push(5);
        push(12);
        System.out.println(min());
        pop();
        pop();
        push(1);
        System.out.println(min());
    }
}
