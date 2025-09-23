import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Array initialization
        ArrayList<Double> doubleList = new ArrayList<>();

        // adding elements to array
        doubleList.add(3.14);
        doubleList.add(12.0);
        doubleList.add(13.5);
        System.out.println(doubleList);
        System.out.println();

        // adding an element to the array in the middle of the ArrayList
        doubleList.add(1, 34.56);
        System.out.println(doubleList);
        System.out.println();

        // counting the number of elements in the array
        int count = 0;
        for (Double d : doubleList) { System.out.println(count++ + ": " + d);}

        // removing all elements in the array then printing the result
        doubleList.clear();
        System.out.println();
        System.out.println(doubleList);
    }
}