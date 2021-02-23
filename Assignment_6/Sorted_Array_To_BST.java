package Assignment_6;

public class Sorted_Array_To_BST {
    static Node root;
   public static  Node sortedArrayToBST(int arr[], int start, int end) {
        if (start > end) {
            return null;
        }
       int mid = (start + end) / 2;
        Node node = new Node(arr[mid]);
        node.left = sortedArrayToBST(arr, start, mid - 1);
        node.right = sortedArrayToBST(arr, mid + 1, end);
        return node;
    }
    static void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public static void main(String[] args) {
        int arr[] = new int[]{45,32,12,3,67,91};
        int n = arr.length;
        Node root = sortedArrayToBST(arr, 0, n - 1);
        System.out.println("Preorder traversal of constructed BST");
        preOrder(root);
    }
}

