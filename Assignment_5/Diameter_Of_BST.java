package Assignment_5;

public class Diameter_Of_BST {
    public static int res=0;
    public static int height(Node root)
    {
        if(root==null)
            return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        res =Math.max(res,1+lh+1+rh);
        return 1+Math.max(lh,rh);
    }

    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.right.left=new Node(40);
        root.right.right=new Node(50);
        height(root);
        System.out.println(res);
    }
}
