import java.util.ArrayList;
import java.util.List;

public class NAryTree {
    Node root;

    NAryTree() {
        this.root = null;
    }

    static class Node {
        int value;
        List<Node> children;

        Node(int value) {
            this.value = value;
            this.children = new ArrayList<>();
        }

        void addChild(int value) {
            this.children.add(new Node(value));
        }

        // Recursive print — mimic in-order traversal
        void print_rec() {
            int n = children.size();

            // If there are children, print left half first
            for (int i = 0; i < n / 2; i++) {
                children.get(i).print_rec();
            }

            // Print current node value
            System.out.println(this.value + " ");

            // Then print remaining children
            for (int i = n / 2; i < n; i++) {
                children.get(i).print_rec();
            }
        }
    }

    void print() {
        if (this.root != null) {
            this.root.print_rec();
            System.out.println();
        }
    }
}
