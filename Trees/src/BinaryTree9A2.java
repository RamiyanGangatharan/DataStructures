import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree9A2 {
    BinaryTree9A2.Node root;
    BinaryTree9A2() { this.root = null; }

    static class Node {
        int value;
        BinaryTree9A2.Node left;
        BinaryTree9A2.Node right;

        Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }

        void addLeft(int value) { this.left = new Node(value); }

        void addRight(int value) { this.right = new Node(value); }

        void print_rec() {
            if (this.left != null) { this.left.print_rec(); }
            System.out.println(this.value + " ");
            if (this.right != null) { this.right.print_rec(); }
        }
    }

    void print() {
        if (this.root != null) {
            this.root.print_rec();
            System.out.println();
        }
    }

    void addNode(char value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode; // If the tree is empty, set the new node as root
            return;
        }

        // Use a queue to perform BFS
        Queue<Node> queue = new LinkedList<>();
        queue.add(root); // Start with the root node

        while (!queue.isEmpty()) {
            Node current = queue.poll(); // Get and remove the current node from the queue

            // Check for left child
            if (current.left == null) {
                current.left = newNode; // Add the new node here
                return;
            } else {
                queue.add(current.left); // Otherwise, add the left child to the queue
            }

            // Check for right child
            if (current.right == null) {
                current.right = newNode; // Add the new node here
                return;
            } else {
                queue.add(current.right); // Otherwise, add the right child to the queue
            }
        }

    }

    Node removeNode(Node node, int value) {
        if (node == null) {
            return null; // Base case: node is not found
        }
        // If the node to be removed is found
        if (node.value == value) {
            // Case 1: Node with two children
            if (node.left != null && node.right != null) {
                // Promote the left child
                Node newNode = node.left;
                // Attach the right child to the left child
                if (newNode.right == null) {
                    newNode.right = node.right; // Attach right child directly
                } else {
                    // Find the rightmost node of the left child
                    Node rightmost = newNode;
                    while (rightmost.right != null) {
                        rightmost = rightmost.right;
                    }
                    rightmost.right = node.right; // Attach right child to the rightmost of the left child
                }
                return newNode; // Promote the left child
            } else {
                // Case 2: Node with only one or no children
                return (node.left != null) ? node.left : node.right;
            }
        }

        // Recursively search for the node to remove in left and right subtrees
        node.left = removeNode(node.left, value);
        node.right = removeNode(node.right, value);

        return node; // Return the current node
    }
}