package Assignment_3;

public class Merge_Two_Sorted_Linked_List {
    public static Node sorted(Node a, Node b)
    {
     if(a==null)
         return b;
     if(b == null)
         return a;
        if(a.data < b.data)
        {
            a.next = sorted(a.next, b);
            return a;
        }
        else
        {
            b.next = sorted(a, b.next);
            return b;
        }
    }
    public static void printList(Node head)
    {
        Node current =head;
        while(current!=null)
        {
            System.out.print(current.data+" ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        a.next = new Node(3);
        b.next = new Node(4);
        a.next.next = new Node(5);
        b.next.next = new Node(6);
        printList(a);
        System.out.println();
        printList(b);
        System.out.println();
        printList(sorted(a,b));
    }
}
