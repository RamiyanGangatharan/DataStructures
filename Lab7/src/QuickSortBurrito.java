import java.util.Arrays;
import java.util.List;

public class QuickSortBurrito {

    public static Burrito[] quickSortBurrito(Burrito [] arr){
        if (arr == null || arr.length <= 1) {
            //had to surround with null compare to ensure that it doesnt throw exception
            if (arr != null) {
                return arr.clone();
            } else {
                System.out.println("null array");
            }
        }
        //preset to null
        Burrito[] c = null;
        //had to surround with null compare to ensure that it doesnt throw exception
        if (arr != null) {
            c = arr.clone();
        }
        // check if c is null to avoid error thrown
        if (c != null) {
            quickSort(c, 0, c.length - 1);
        }
        return c;
    }

    public static void quickSort(Burrito [] arr, int left, int right) {
        if (left < right) {
            int pivot = partition(arr, left, right);
            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }

//    public static int partition(Burrito[] arr, int left, int right) {
//        Burrito pivot = arr[left];
//        int i = left + 1;
//        int j = right;
//
//        while (i <= j) {
//            //make sure left [i] hasnt exceeded right [j]
//            while (i <= j &&
//                    //if the burrito (current) is the same size as the pivot burrito
//                    // then check if the protein comes alphabetically before or equal
//                    // to the pivot. if it does then move forward since this element is correct
//                    ((arr[i].getSize().equals(pivot.getSize()) &&
//                    arr[i].getProtein().compareTo(pivot.getProtein()) <= 0)
//                    //if the element is large but the pivot is not, then the element should
//                    // move forward becuase large has priority
//                    || (arr[i].getSize().equals("large") && !pivot.getSize().equals("large")))) { // when true move forward
//                i++;
//            }
//            //make sure left [i] hasnt exceeded right [j]
//            while (i <= j &&
//                    //if current burrito is small but the pivot is not small,
//                    // then move element [j] backwards because large comes first
//                    ((arr[j].getSize().equals(pivot.getSize()) &&
//                            arr[j].getProtein().compareTo(pivot.getProtein()) > 0)
//                            || (arr[j].getSize().equals("small") && !pivot.getSize().equals("small")))) { //move the j element backwards until it finds one that needs to be swapped with i
//                j--;
//            }
//            //swap if i element is less then j
//            if (i < j) swap(arr, i, j);
//        }
//        swap(arr, left, j);
//        return j;
//    }

    public static int compareBurrito(Burrito a, Burrito b) {
        List<String> order = Arrays.asList("large", "medium", "small");
        int sizeComp = Integer.compare(order.indexOf(a.getSize()), order.indexOf(b.getSize()));
        if (sizeComp != 0) return sizeComp;
        return a.getProtein().compareTo(b.getProtein());
    }

    public static int partition(Burrito[] arr, int left, int right) {
        Burrito pivot = arr[left];
        int i = left + 1;
        int j = right;

        while (i <= j) {
            while (i <= j && compareBurrito(arr[i], pivot) <= 0) {
                i++;
            }
            while (i <= j && compareBurrito(arr[j], pivot) > 0) {
                j--;
            }

            if (i < j) swap(arr, i, j);
        }
        swap(arr, left, j);
        return j;
    }

    // Utility function to swap two elements in an array
    public static void swap(Burrito[] arr, int i, int j) {
        Burrito temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}