package Assignment_3;

public class Sum_Of_Linked_List {
    public static Node sum(Node l1,Node l2)
    {
        Node prev =null;
        Node temp =null;
        Node res = null;
        int carry =0, sum;
        while(l1!=null || l2!=null)
        {
            sum = carry + ((l1!=null)? l1.data:0) + ((l2!=null)?l2.data:0);
            if(sum>=10)
            { sum=sum%10;
              carry =1; }
            else carry =0;
            temp = new Node(sum);
            if(res == null)
                res = temp;
            else prev.next = temp;
            prev = temp;
            if(l1!=null)
                l1 = l1.next;
            if(l2!=null)
                l2 = l2.next;
        }
        if(carry>0)
            temp.next = new Node(carry);
        return res;
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
     Node l1 = new Node(7);
     l1.next = new Node(5);
     l1.next.next = new Node(9);
     printList(l1);
     System.out.println();
     Node l2 =new Node(8);
     l2.next = new Node(4);
     printList(l2);
     System.out.println();
     printList(sum(l1,l2));
    }
}
