package Assignment_5;

import java.util.ArrayList;

public class LCA_Of_BST {
    public static boolean findPath(Node root, ArrayList<Node> p,int n)
    {
        if(root==null)
         return false;
        p.add(root);
        if(root.key==n) return true;
        if(findPath(root.left,p,n)|| findPath(root.right,p,n))
            return true;
        p.remove(p.size()-1);
        return false;
    }
    public static Node lca(Node root,int n1,int n2)
    {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        if(findPath(root,path1,n1)== false|| findPath(root,path2,n2)==false)
            return null;
        else
            for(int i=0;i<path1.size()-1 && i<path2.size()-1;i++)
            {
                if(path1.get(i + 1) != path2.get(i + 1))
                    return path1.get(i);
            }
            return null;
    }

    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.right.left=new Node(40);
        root.right.right=new Node(50);
        Node x = lca(root,20,50);
        System.out.println(x.key);
    }

}
