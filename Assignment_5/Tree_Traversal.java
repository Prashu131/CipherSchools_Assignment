package Assignment_5;

public class Tree_Traversal {
    static void inorder(Node root)
    {
        if(root!=null)
        {
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }
    static void preorder(Node root)
    {
        if(root!=null)
        {
            System.out.print(root.key+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    static void postOrder(Node root)
    {
        if(root!=null)
        {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.key+" ");
        }
    }
    public static void main(String[] args)
    {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postOrder(root);
    }
}
