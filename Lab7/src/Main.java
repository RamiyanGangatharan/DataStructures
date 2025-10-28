import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Burrito burrito1 = new Burrito("small", "steak", "brown", "black", "tomatoes", false);
        Burrito burrito2 = new Burrito("large", "chicken", "white", "pinto", "cheese", true);

        System.out.println("PRINT ARRAY");
        Burrito[] burrito = {burrito1, burrito2};
        printArray(burrito);

        LinkedList<Burrito> BL = new LinkedList<>();
        BL.add(burrito1);
        BL.add(burrito2);

        System.out.println("----------------------------------------");
        System.out.println("PRINT LINKEDLIST");

        printList(BL);
    }

    /**
     * This method prints the array that is given to it.
     * The isEmpty method doesn't exist here so I made a different conditional statement to check.
     * @param arr the array being printed out
     */
    public static void printArray(Burrito[] arr) { System.out.println(arr.length < 1 ? "[EMPTY]" : Arrays.toString(arr)); }

    /**
     * This method prints the linked list that is given to it.
     * @param list the linked list being printed out
     */
    public static void printList(LinkedList<Burrito> list) { System.out.println(list.isEmpty() ? "[EMPTY]" : list); }
}