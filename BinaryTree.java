import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left;   // Changed to lowercase to follow standard conventions
    Node right;  // Changed to lowercase

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    public static Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            Node temp = q.poll();
            
            // Check left child
            if (temp.left == null) {
                temp.left = new Node(data); // Fixed 'node' to 'Node'
                break;
            } else {
                q.offer(temp.left);
            }
            
            // Check right child
            if (temp.right == null) {
                temp.right = new Node(data);
                break;
            } else {
                q.offer(temp.right);
            }
        }
        return root;
    }

    // --- Added Missing Traversal Methods ---

    public static void preorderTraversal(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    public static void inorderTraversal(Node root) {
        if (root == null) return;
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }

    public static void postorderTraversal(Node root) {
        if (root == null) return;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        Node root = null;
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);

        System.out.println("Preorder traversal:");
        preorderTraversal(root);

        System.out.println("\n\nInorder traversal:"); // Fixed 'lnorder' typo
        inorderTraversal(root);

        System.out.println("\n\nPostorder traversal:");
        postorderTraversal(root);
        System.out.println();
    }
}