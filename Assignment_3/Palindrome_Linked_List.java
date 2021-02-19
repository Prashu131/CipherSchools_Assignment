package Assignment_3;

import java.util.ArrayDeque;
import java.util.Deque;

public class Palindrome_Linked_List {

    public static boolean check(Node head)
    {
        Deque<Integer> stack =new ArrayDeque<>();
        Node current = head;
        while(current!=null)
        {
            stack.push(current.data);
            current=current.next;
        }
        current =head;
        while(current!=null)
        {
            if(current.data!=stack.pop())
                return false;
            current = current.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Node head = new Node('m');
        head.next = new Node('a');
        head.next.next = new Node('d');
        head.next.next.next =new Node('a');
        head.next.next.next.next = new Node('m');
        System.out.println("Is Palindrome : "+check(head));
    }
}
