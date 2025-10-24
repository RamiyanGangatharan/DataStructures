import java.util.Arrays;

public class MergeSortString {
    public static void main(String[] args) {

        // Split the string into an array of words
        String[] sample = "Hello World Merge Sort Example".split(" ");

        System.out.println("MERGE SORT");
        System.out.println("==========");
        System.out.print("Original Array: ");
        printArray(sample);
        System.out.print("Sorted Array: ");
        printArray(mergeSort(sample, 0, sample.length - 1));
    }

    public static String[] mergeSort(String[] array, int left, int right) {
        if (left < right) {
            int midpoint = (left + right) / 2;
            mergeSort(array, left, midpoint);
            mergeSort(array, midpoint + 1, right);
            merger(array, left, midpoint, right);
        }
        return array;
    }

    public static void merger(String[] array, int left, int mid, int right) {
        int leftSize = mid - left + 1;
        int rightSize = right - mid;

        String[] leftArray = new String[leftSize];
        String[] rightArray = new String[rightSize];

        for (int i = 0; i < leftSize; i++) { leftArray[i] = array[left + i]; }
        for (int i = 0; i < rightSize; i++) { rightArray[i] = array[mid + 1 + i]; }

        int i = 0, j = 0, k = left;

        while (i < leftSize && j < rightSize) {
            // Compare strings alphabetically
            if (leftArray[i].compareToIgnoreCase(rightArray[j]) <= 0) { array[k++] = leftArray[i++]; }
            else { array[k++] = rightArray[j++]; }
        }

        while (i < leftSize) { array[k++] = leftArray[i++]; }
        while (j < rightSize) { array[k++] = rightArray[j++]; }
    }

    public static void printArray(String[] array) { System.out.println(Arrays.toString(array)); }
}
