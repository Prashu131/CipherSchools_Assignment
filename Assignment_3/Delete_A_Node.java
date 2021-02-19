package Assignment_3;

public class Delete_A_Node {
    public static void delete(Node head,int x)
    {
        Node current = head;
        while(current!=null)
        {
            if(current.next.data == x)
            {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
        System.out.println("No such element exists");
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
        Node head = new Node(3);
        head.next = new Node(6);
        head.next.next = new Node(8);
        head.next.next.next = new Node(13);
        head.next.next.next.next = new Node(17);
        printList(head);
        System.out.println();
        delete(head,13);
        printList(head);
    }
}
