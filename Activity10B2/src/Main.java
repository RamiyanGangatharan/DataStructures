import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        AVLTree AVLT = new AVLTree();

        Random rand = new Random();

        for (int i = 0; i < 25; i++) {
            AVLT.insert(rand.nextInt(2,2000));
        }

        AVLT.printInOrder();
        AVLT.printTree();
    }
}