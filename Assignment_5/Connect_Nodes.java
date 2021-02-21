package Assignment_5;

public class Connect_Nodes {

        public static void connectLevel(Node root) {
            while(root != null) {
                Node dummyTreeNode = new Node(Integer.MIN_VALUE);
                Node childNode = dummyTreeNode;

                while (root != null) {
                    if (root.left != null) {
                        childNode.next = root.left;
                        childNode = childNode.next;
                    }
                    if (root.right != null) {
                        childNode.next = root.right;
                        childNode = childNode.next;
                    }
                    root = root.next;
                }
                root = dummyTreeNode.next;
            }
        }


        public static void printTree(Node root) {
            if(root == null) {
                return;
            }

            Node temp = root;
            while(temp != null) {
                System.out.print(temp.key + "  ");
                temp = temp.next;
            }
            System.out.println();
            if(root.left != null) {
                printTree(root.left);
            } else {
                printTree(root.right);
            }

        }
        public static void main(String[] args) {
            Node root = new Node(10);
            root.left = new Node(20);
            root.right = new Node(30);
            root.left.left = new Node(40);
            root.right.right = new Node(50);
            connectLevel(root);
            printTree(root);

        }
}

