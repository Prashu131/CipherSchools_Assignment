package Assignment_3;

public class Remove_All_Duplicates {
    public static void removal(Node head) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        Node current =head;
        while (current != null)
        {
            while (current.next != null &&
                    prev.next.data== current.next.data)
                current = current.next;
            if (prev.next == current)
                prev = prev.next;
            else
                prev.next = current.next;

            current = current.next;
        }
        head = dummy.next;
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
        Node head = new Node(7);
        head.next = new Node(5);
        head.next.next = new Node(5);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(7);
        head.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next = new Node(8);
        printList(head);
        removal(head);
        System.out.println();
        printList(head);
    }
}

