public class BinaryTree {
    Node root;
    BinaryTree() { this.root = null; }

    static class Node {
        int value;
        Node left;
        Node right;

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
}