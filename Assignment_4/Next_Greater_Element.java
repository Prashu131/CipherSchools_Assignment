package Assignment_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class Next_Greater_Element {
    public static void find(int[] arr, int n)
    {   ArrayList<Integer> v=new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        s.push(arr[n-1]);
        v.add(-1);
        for(int i=n-2;i>=0;i--)
        {
            while(s.empty()==false && s.peek()<=arr[i])
            {
                s.pop();
            }
            int next_greater = (s.isEmpty())?(-1):(s.peek());
            v.add(next_greater);
            s.add(arr[i]);
        }
        Collections.reverse(v);
        for(Integer j:v)
            System.out.print(j +" ");
    }

    public static void main(String[] args) {
        int[] arr= {5,15,10,8,6,12,9,18};
        find(arr,arr.length);
    }
}
