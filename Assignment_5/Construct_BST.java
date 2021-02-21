package Assignment_5;

public class Construct_BST {
    static int preindex=0;
    public static Node construct(int in[],int[] pre,int is,int ie)
    {
        if(is>ie)
            return null;
        Node root = new Node (pre[preindex++]);
        int inIndex=is;
        for(int i=is;i<=ie;i++)
        {
            if(in[i]== root.key)
            {
               inIndex=i;
               break;
            }
        }
        root.left= construct(in,pre,is,inIndex-1);
        root.right = construct(in,pre,inIndex+1,ie);
        return root;
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
        int[] in = {40,20,10,30};
        int[] pre= {10,20,40,30};
        int n = in.length;
        Node root = construct(in,pre,0,n-1);
        postOrder(root);


    }
}
