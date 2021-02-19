package Assignment_3;

public class Intersection_Point_In_A_Linked_List {
    public static int find_point(Node list1,Node list2)
    {
        int c1=0,c2=0,d;
        Node curr1 = list1;
        Node curr2 = list2;
        while(curr1!=null)
        {
            c1++;
            curr1 = curr1.next;
        }
        while(curr2!=null)
        {
            c2++;
            curr2 = curr2.next;
        }
        if(c1>c2)
        {
            d=c1-c2;
            return intersect_point(d,list1,list2);
        }
        else
        {
            d=c2-c1;
            return intersect_point(d,list2,list1);
        }
    }
    public static int intersect_point(int d, Node node1, Node node2 )
    {
        int i;
        Node current1 = node1;
        Node current2 = node2;
        for (i = 0; i < d; i++) {
            if (current1 == null) {
                return -1;
            }
            current1 = current1.next;
        }
        while (current1 != null && current2 != null) {
            if (current1.data == current2.data) {
                return current1.data;
            }
            current1 = current1.next;
            current2 = current2.next;
        }
        return -1;
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

        Node list1 = new Node(3);
        list1.next = new Node(6);
        list1.next.next = new Node(9);
        list1.next.next.next = new Node(15);
        list1.next.next.next.next = new Node(30);
        printList(list1);
        System.out.println();
        Node list2 = new Node(10);
        list2.next = new Node(15);
        list2.next.next = new Node(30);
        printList(list2);
        System.out.println();
        System.out.print("The Intersection Point is : "+find_point(list1,list2));
    }
}
