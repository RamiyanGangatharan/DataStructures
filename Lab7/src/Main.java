import java.util.Arrays;
import java.util.LinkedList;


//use quick sort to sort array
public class Main {
    public static void printArray(Burrito[] arr) {
        if (arr.length == 0) { System.out.println("[EMPTY]"); }
        else {
            System.out.print("[");
            boolean first = true;
            for (Burrito b : arr) {
                if (!first) { System.out.print(", "); }
                System.out.print(b.getSize() + " " + b.getProtein());
                first = false;
            }
            System.out.print("]\n");
        }
    }

    public static void main(String[] args) {

        //CREATE OBJECTS
        Burrito burrito1 = new Burrito("small", "chicken", "white", "black", "cheese", false);
        Burrito burrito2 = new Burrito("large", "steak", "brown", "pinto", "tomatoes", true);
        Burrito burrito3 = new Burrito("medium", "carnitas", "white", "black", "lettuce", false);
        Burrito burrito4 = new Burrito("large", "sofritas", "brown", "none", "corn salsa", true);
        Burrito burrito5 = new Burrito("small", "none", "none", "none", "plain", false);
        Burrito burrito6 = new Burrito("medium", "chicken", "brown", "pinto", "cheese + sour cream", true);
        Burrito burrito7 = new Burrito("large", "steak", "white", "black", "pico de gallo", true);

        //create burrito arrays
        Burrito[] burritos = { burrito1, burrito2, burrito3, burrito4, burrito5, burrito6, burrito7 };
        Burrito[] burritoEmpty = {};
        Burrito[] burritoSingle = { burrito1 };
        Burrito[] burritoSame = { burrito1, burrito1, burrito1, burrito1, burrito1, burrito1, burrito1 };

        // print original arrays
        System.out.println("Original Arrays:");
        printArray(burritos);
        printArray(burritoEmpty);
        printArray(burritoSingle);
        printArray(burritoSame);
        System.out.println(" ");

        //quick sort all burrito arrays into new copied
        Burrito[] burritosSorted = QuickSortBurrito.quickSortBurrito(burritos);
        Burrito[] burritosEmptySorted = QuickSortBurrito.quickSortBurrito(burritoEmpty);
        Burrito[] burritoSingleSorted = QuickSortBurrito.quickSortBurrito(burritoSingle);
        Burrito[] burritoSameSorted = QuickSortBurrito.quickSortBurrito(burritoSame);

        //print sorted array
        System.out.println("----------------------------------------");
        System.out.println("PRINT SORTED ARRAY");
        System.out.println("----------------------------------------");
        printArray(burritosSorted);

        //test cases
        //empty
        System.out.println("----------------------------------------");
        System.out.println("PRINT SORTED EMPTY ARRAY");
        System.out.println("----------------------------------------");
        printArray(burritosEmptySorted);
        //single
        System.out.println("----------------------------------------");
        System.out.println("PRINT SORTED SINGLE ARRAY");
        System.out.println("----------------------------------------");
        printArray(burritoSingleSorted);

        //same
        System.out.println("----------------------------------------");
        System.out.println("PRINT SORTED SAME ARRAY");
        System.out.println("----------------------------------------");
        printArray(burritoSameSorted);



        // create linkedlists
        LinkedList<Burrito> list = new LinkedList<>();
        list.add(burrito1);
        list.add(burrito2);
        list.add(burrito3);
        list.add(burrito4);
        list.add(burrito5);
        list.add(burrito6);
        list.add(burrito7);

        LinkedList<Burrito> emptyList = new LinkedList<>();
        LinkedList<Burrito> singleList = new LinkedList<>();
        singleList.add(burrito2);

        LinkedList<Burrito> sameList = new LinkedList<>();
        sameList.add(burrito2);
        sameList.add(burrito2);
        sameList.add(burrito2);
        sameList.add(burrito2);
        sameList.add(burrito2);
        sameList.add(burrito2);
        sameList.add(burrito2);

        System.out.println("Original Lists:");
        System.out.println("Regular List: " + list);
        System.out.println();
        System.out.println("Empty List: " + emptyList);
        System.out.println();
        System.out.println("Single List: " + singleList);
        System.out.println();
        System.out.println("Same List: " + sameList);

        LinkedList<Burrito> sortedList = (LinkedList<Burrito>) BurritoMergeSort.sort(list, 0, list.size() - 1);
        LinkedList<Burrito> sortedEmptyList = (LinkedList<Burrito>) BurritoMergeSort.sort(emptyList, 0, emptyList.size() - 1);
        LinkedList<Burrito> sortedSingleList = (LinkedList<Burrito>) BurritoMergeSort.sort(singleList, 0, singleList.size() - 1);
        LinkedList<Burrito> sortedSameList = (LinkedList<Burrito>) BurritoMergeSort.sort(sameList, 0, sameList.size() - 1);

        System.out.println("----------------------------------------");
        System.out.println("PRINT SORTED LIST");
        System.out.println("----------------------------------------");
        System.out.println(sortedList);

        //test cases
        //empty
        System.out.println("----------------------------------------");
        System.out.println("PRINT SORTED EMPTY LIST");
        System.out.println("----------------------------------------");
        System.out.println(sortedEmptyList);
        //single
        System.out.println("----------------------------------------");
        System.out.println("PRINT SORTED SINGLE LIST");
        System.out.println("----------------------------------------");
        System.out.println(sortedSingleList);

        //same
        System.out.println("----------------------------------------");
        System.out.println("PRINT SORTED SAME LIST");
        System.out.println("----------------------------------------");
        System.out.println(sortedSameList);
    }
}