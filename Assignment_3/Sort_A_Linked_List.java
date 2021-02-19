package Assignment_3;

public class Sort_A_Linked_List {
    public static Node sort(Node head)
    {
        Node current = head;
        Node index = null;
        int temp;
        while(current.next!=null)
        {
            index = current.next;
            while(index!=null) {
                if (current.data > index.data) {
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }

            index = index.next;
        }
        current = current.next;
        }
        return head;
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
        Node head = new Node(5);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);
        printList(head);
        System.out.println();
        printList(sort(head));
    }
}
