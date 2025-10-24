import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] array = {22, 56, 71, 2, 125, 1, 45, 26, 77, 24};
        int[] array2 = {22, 56, 71, 2, 125, 1, 45, 26, 77, 24};

        System.out.println("SELECTION SORT");
        System.out.println("==============");
        System.out.print("Original Array: ");
        printArray(array);
        System.out.print("Sorted Array: ");
        printArray(SelectionSort(array));

        System.out.println();

        System.out.println("MERGE SORT");
        System.out.println("==========");
        System.out.print("Original Array: ");
        printArray(array2);
        System.out.print("Sorted Array: ");
        printArray(mergeSort(array2, 0, array.length - 1));
    }

    public static int[] SelectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) { minIndex = j; }
                // swap the found min element
                if (minIndex != 1) {
                    int temp = array[i];
                    array[i] = array[minIndex];
                    array[minIndex] = temp;
                }
            }
        }
        return array;
    }

    public static int[] mergeSort(int[] array, int left, int right) {
        //if the array can be divided, divide, conquer, combine
        if (left < right) {
            int midpoint = (left + right) / 2;
            mergeSort(array, left, midpoint);
            mergeSort(array, midpoint + 1, right);
            merger(array, left, midpoint, right);
        }
        return array;
    }

    public static void merger(int[] array, int left, int mid, int right) {
        // Sizes of two subarrays to be merged
        int leftSize = mid-left+1;
        int rightSize = right-mid;

        // Temp arrays
        int [] leftArray = new int[leftSize];
        int [] rightArray = new int[rightSize];

        // Copy data to temp arrays (manual)
        for (int i = 0; i < leftSize; i++) { leftArray[i] = array[left + i]; }
        for (int i = 0; i < rightSize; i++) { rightArray[i] = array[mid + 1 + i]; }

        // Initial indexes of first/second sub-array, and merged sub-array
        int i = 0, j = 0, k = left;

        // merge by taking smallest of two values
        while (i < leftSize && j < rightSize) {
            if (leftArray[i] < rightArray[j]) { array[k++] = leftArray[i++]; }
            else { array[k++] = rightArray[j++]; }
        }

        //take the rest of the left array and right array
        while (i < leftSize) { array[k++] = leftArray[i++]; }
        while (j < rightSize) { array[k++] = rightArray[j++]; }
    }

    public static void printArray(int[] array){ System.out.println(Arrays.toString(array));}
}