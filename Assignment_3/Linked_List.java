package Assignment_3;

import java.util.Scanner;

public class Linked_List {
    static Scanner sc = new Scanner(System.in);
    public static void Singly_Linked_List(Node head,int n)
    {
        Node current =head;
        for(int i=1;i<n;i++)
        {
            int data = sc.nextInt();
            current.next = new Node(data);
            current= current.next;
        }
    }
    public static void Read(Node head)
    {
        Node current = head;
        while(current!=null)
        {
            System.out.print(current.data+" -> ");
            current = current.next;
        }
    }
    public static void update(Node head, int x, int y)
    {
        if(head==null)
            return;
        Node current =head;
        while(current.next!= null)
        {
            if(current.data == x)
            {
                current.data = y;
                return;
            }
            current =current.next;
        }
        current.next = new Node (y);
    }
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
    public static void main(String[] args)
    {
        int n =sc.nextInt();
        int data =sc.nextInt();
        Node head = new Node(data);
        Singly_Linked_List(head,n);
        Read(head);
        //System.out.println();
        //update(head,5,5);
        //Read(head);
        System.out.println();
        delete(head,1);
        Read(head);
    }
}
