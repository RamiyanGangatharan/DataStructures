import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class ArrayTest {
    public static void main(String[] args)
    {
        ComplexityLab lab = new ComplexityLab();
        int numOfElements = 5000;
        long o = 0;

        int[] array1 = new int[numOfElements];
        int[] array2 = new int[numOfElements];
        int[] array3 = new int[numOfElements];
        int[] array4 = new int[numOfElements];

        LinkedList<Integer> linkedList1 = new LinkedList<>();
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        LinkedList<Integer> linkedList3= new LinkedList<>();
        LinkedList<Integer> linkedList4 = new LinkedList<>();

        populateArray(array1, 1, 100000);
        populateArray(array2, 1, 100000);
        populateArray(array3, 1, 100000);
        populateArray(array4, 1, 100000);

        populateLinkedList(linkedList1, 1, 1000000, 5000);
        populateLinkedList(linkedList2, 1, 1000000, 5000);
        populateLinkedList(linkedList3, 1, 1000000, 5000);
        populateLinkedList(linkedList4, 1, 1000000, 5000);

        System.out.println("Sort Type | Data Struct | Operation | Runtime (ms)");
        System.out.println("-----------------------------------------------");


        long start = System.currentTimeMillis();
        o = ComplexityLab.quickSortList(linkedList1);
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        System.out.println("QUICK          LINKEDLIST       " + o + "         " + elapsedTime);

        start = System.currentTimeMillis();
        o = ComplexityLab.insertionSortList(linkedList2);
        long end1 = System.currentTimeMillis();
        long elapsedTime1 = end - start;
        System.out.println("INSERTION      LINKEDLIST       " + o + "         " + elapsedTime1);

        start = System.currentTimeMillis();
        o = ComplexityLab.mergeSortList(linkedList3);
        end = System.currentTimeMillis();
        long elapsedTime2 = end - start;
        System.out.println("MERGE          LINKEDLIST       " + o + "         " + elapsedTime2);

        start = System.currentTimeMillis();
        o = ComplexityLab.selectionSortList(linkedList4);
        end = System.currentTimeMillis();
        long elapsedTime3 = end - start;
        System.out.println("SELECTION      LINKEDLIST       " + o + "         " + elapsedTime3);

        start = System.currentTimeMillis();
        ComplexityLab.quickSortArray(array3, 0, array3.length - 1, 0);
        end = System.currentTimeMillis();
        long elapsedTime8 = end - start;
        System.out.println("QUICK         ARRAY      " + o + "         " + elapsedTime8);

        start = System.currentTimeMillis();
        o = ComplexityLab.insertionSortArray(array1);
        end = System.currentTimeMillis();
        long elapsedTime5 = end - start;
        System.out.println("INSERTION      ARRAY       " + o + "         " + elapsedTime5);

        start = System.currentTimeMillis();
        o = ComplexityLab.mergeSortArray(array2);
        end = System.currentTimeMillis();
        long elapsedTime6 = end - start;
        System.out.println("MERGE          ARRAY       " + o + "         " + elapsedTime6);

        start = System.currentTimeMillis();
        o = ComplexityLab.selectionSortArray(array4);
        end = System.currentTimeMillis();
        long elapsedTime7 = end - start;
        System.out.println("SELECTION      ARRAY       " + o + "         " + elapsedTime7);
    }

    Random random = new Random();
    public static void populateArray(int[] arr, int min, int max) {
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt((max - min) + 1) + min;
        }
    }

    public static void populateLinkedList(LinkedList<Integer> list, int min, int max, int size)  {
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            list.add(rand.nextInt((max - min) + 1) + min);
        }
    }

}
