public class Main {
    public static void main(String[] args) {
        System.out.println("BINARY TREE: ");
        BinaryTree Btree = new BinaryTree();

        Btree.root = new BinaryTree.Node(4);
        Btree.root.addLeft(2);
        Btree.root.addRight(6);

        Btree.root.left.addLeft(1);
        Btree.root.left.addRight(3);

        Btree.root.right.addLeft(5);
        Btree.root.right.addRight(7);

        Btree.print();

        System.out.println("BINARY TREE NEW: ");
        BinaryTree9A2 Btree2 = new BinaryTree9A2();
        Btree2.root = new BinaryTree.Node(4);
        Btree2.root.addLeft(2);
        Btree.root.addRight(6);

        Btree.root.left.addLeft(1);
        Btree.root.left.addRight(3);

        Btree.root.right.addLeft(5);
        Btree.root.right.addRight(7);

        Btree.print();

        System.out.println("====================================");

        System.out.println("====================================");

        System.out.println("TERNARY TREE");

        TernaryTree TTree = new TernaryTree();
        TTree.root = new TernaryTree.Node(5);
        TTree.root.addLeft(2);
        TTree.root.addRight(6);

        TTree.root.left.addLeft(1);
        TTree.root.left.addCenter(3);
        TTree.root.left.addRight(4);

        TTree.root.right.addLeft(7);
        TTree.root.right.addCenter(8);
        TTree.root.right.addRight(9);

        TTree.print();

        System.out.println("====================================");
        System.out.println("N-ARY TREE");

        // Create and build the N-ary tree
        NAryTree NTree = new NAryTree();
        NTree.root = new NAryTree.Node(1);

        // Root has 3 children
        NTree.root.addChild(2);
        NTree.root.addChild(3);
        NTree.root.addChild(4);

        // Add children to node 2
        NTree.root.children.get(0).addChild(5);
        NTree.root.children.get(0).addChild(6);

        // Add children to node 4
        NTree.root.children.get(2).addChild(7);
        NTree.root.children.get(2).addChild(8);
        NTree.root.children.get(2).addChild(9);

        NTree.print();
    }
}
