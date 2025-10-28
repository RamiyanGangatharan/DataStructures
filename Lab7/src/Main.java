import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Burrito burrito1 = new Burrito("small", "chicken", "white", "black", "cheese", false);
        Burrito burrito2 = new Burrito("large", "steak", "brown", "pinto", "tomatoes", true);
        Burrito burrito3 = new Burrito("medium", "carnitas", "white", "black", "lettuce", false);
        Burrito burrito4 = new Burrito("large", "sofritas", "brown", "none", "corn salsa", true);
        Burrito burrito5 = new Burrito("small", "none", "none", "none", "plain", false);
        Burrito burrito6 = new Burrito("medium", "chicken", "brown", "pinto", "cheese + sour cream", true);
        Burrito burrito7 = new Burrito("large", "steak", "white", "black", "pico de gallo", true);


        System.out.println("----------------------------------------");
        System.out.println("PRINT ARRAY");
        Burrito[] burritos = { burrito1, burrito2, burrito3, burrito4, burrito5, burrito6, burrito7 };
        printArray(burritos);

        LinkedList<Burrito> burritoList = new LinkedList<>();
        burritoList.add(burrito1);
        burritoList.add(burrito2);
        burritoList.add(burrito3);
        burritoList.add(burrito4);
        burritoList.add(burrito5);
        burritoList.add(burrito6);
        burritoList.add(burrito7);

        System.out.println("----------------------------------------");
        System.out.println("PRINT LINKEDLIST");
        printList(burritoList);
        System.out.println("----------------------------------------");
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