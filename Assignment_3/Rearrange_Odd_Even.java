package Assignment_3;

public class Rearrange_Odd_Even {
    public static Node rearrange(Node head)
    {
        if(head==null)
            return null;
        Node odd =head;
        Node even = head.next;
        Node evenFirst = even;
        while(true)
        {
            if(odd==null || even ==null || even.next==null)
            {
                odd.next = evenFirst;
                break;
            }
            odd.next = even.next;
            odd = even.next;
            if(odd.next ==null)
            {
                even.next =null;
                odd.next = evenFirst;
                break;
            }
            even.next =odd.next;
            even = odd.next;
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
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(6);
        printList(head);
        System.out.println();
        printList( rearrange(head));
    }
}
