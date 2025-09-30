
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> intQ = new LinkedList<>();
        Queue<String> strQ = new LinkedList<>();

        intQ.add(1);
        intQ.add(2);
        intQ.add(3);
        intQ.add(4);
        intQ.add(5);
        intQ.add(6);

        strQ.add("Amy");
        strQ.add("Bruce");
        strQ.add("Collin");
        strQ.add("Dexter");
        strQ.add("Emily");
        strQ.add("Francis");

        System.out.println("Integer Queue Size: " + intQ.size());
        System.out.println("String Queue Size: " + strQ.size());

        while (!intQ.isEmpty() && !strQ.isEmpty())
        {
            System.out.println(intQ.peek() + ": " + strQ.peek());
            intQ.remove();
            strQ.remove();
        }

        System.out.println();
        System.out.println("Integer Queue Size: " + intQ.size());
        System.out.println("String Queue Size: " + strQ.size());

    }
}