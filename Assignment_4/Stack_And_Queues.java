package Assignment_4;

public class Stack_And_Queues {
    private static Node top;
    private static Node head;
    private static Node tail;
    public static boolean isStackEmpty()
    {
        return (top==null);
    }
    public static void push(int data)
    {
        Node x= new Node(data);
        x.next = top;
        top= x;
    }
    public static int pop()
    {
        if(top==null)
            return 0;
        int data = top.data;
        top =top.next;
        return data;
    }
    public static boolean isQueueEmpty()
    {
        return head==null;
    }
    public static void add(int data)
    {
        Node x= new Node(data);
        if(head==null)
    {
        head=x;
    }
        if(tail!=null)
        {
            tail.next=x;
        }
        tail = x;
    }
    public static int remove()
    {
        int data = head.data;
        head = head.next;
        if(head == null)
            tail=null;
        return data;
    }

    public static void main(String[] args) {
        push(5);
        push(7);
        push(11);
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(isStackEmpty());
        add(45);
        add(67);
        add(74);
        add(2);
        System.out.println(remove());
        System.out.println(remove());
        System.out.println(isQueueEmpty());
    }
}
