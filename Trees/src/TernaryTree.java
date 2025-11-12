public class TernaryTree {
    Node root;
    TernaryTree() { this.root = null; }

    static class Node {
        int value;
        Node left;
        Node right;
        Node center;

        Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
            this.center = null;
        }

        void addLeft(int value) { this.left = new Node(value); }
        void addRight(int value) { this.right = new Node(value); }
        void addCenter(int value) { this.center = new Node(value); }

        void print_rec() {
            if (this.left != null) { this.left.print_rec(); }
            System.out.println(this.value + " ");
            if (this.center != null) { this.center.print_rec(); }
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