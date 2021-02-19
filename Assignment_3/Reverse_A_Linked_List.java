package Assignment_3;

public class Reverse_A_Linked_List {
    public static void reverse(Node head)
    {
        Node prev =null;
        Node current = head;
        Node next =null;
        while(current!=null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        printList(head);
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
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        printList(head);
        System.out.println("\nReversed List");
        reverse(head);
    }
}
