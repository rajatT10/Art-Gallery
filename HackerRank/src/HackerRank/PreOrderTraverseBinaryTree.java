package HackerRank;

public class PreOrderTraverseBinaryTree {
    Node root;

    static class Node {
        Node left;
        Node right;
        int data;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void insertNode(Node root, int data){
        if (root!= null) {
            if(data > root.data){
                if(root.left!=null){
                    insertNode(root.left,data);
                }
                else {
                    Node newNode = new Node(data);
                    root.left = newNode;
                }
            } else if(data < root.data){
                if(root.right!=null){
                    insertNode(root.right,data);
                } else {
                    Node newNode = new Node(data);
                    root.right = newNode;
                }
            }

        } else {
            Node newNode = new Node(data);
            root = newNode;
        }
    }

    public static void preOrderTraverse(){

    }

    public static void main(String[] args) {
        PreOrderTraverseBinaryTree tree = new PreOrderTraverseBinaryTree();
        insertNode(tree.root,1);
        insertNode(tree.root,2);
        insertNode(tree.root,3);
        insertNode(tree.root,4);
        insertNode(tree.root,5);
        System.out.println("tree = " + tree);
    }
}
