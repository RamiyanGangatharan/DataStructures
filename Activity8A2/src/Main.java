import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] quick = new int[] {0, Integer.MAX_VALUE / (5 / 2)};
        int[] merge = new int[] {0, Integer.MAX_VALUE / (5 / 2)};
        int[] count = new int[] {0, Integer.MAX_VALUE / (5 / 2)};


        for (int run = 1; run <= 5; run++) {
            System.out.println("Run " + run + ":");

            long startTime = System.currentTimeMillis();
            mergeSort(merge, 0, merge.length - 1);
            long endTime = System.currentTimeMillis();
            System.out.println("Merge Sort Time: " + (endTime - startTime) + " ms");

            startTime = System.currentTimeMillis();
            quickSort(quick, 0, quick.length - 1);
            endTime = System.currentTimeMillis();
            System.out.println("Quick Sort Time: " + (endTime - startTime) + " ms\n");

            startTime = System.currentTimeMillis();
            countingSort(count, Integer.MAX_VALUE / (5 / 2));
            endTime = System.currentTimeMillis();
            System.out.println("Counting Sort Time: " + (endTime - startTime) + "ms\n");
        }
    }

    // ===================== MERGE SORT ==============================
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

    //################################## QUICK SORT #####################################

    public static void quickSort(int[] arr, int left, int right) {
        // make sure there is something still to sort (not a single element)
        if (left < right) {
            // partitionInverse the array
            int pivot = partition(arr, left, right);
            //recursively sort two partitions
            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }


    public static int partition(int[] arr, int left, int right) {
        //use the left value as the pivot
        int pivot = arr[left];
        // Start from the element right after the pivot
        int i = left + 1;
        // Start from the end of the array
        int j = right;
        // while there are still values left to compare
        while (i <= j) {
            // Move i to the right until we find an element greater than or equal to the pivot
            while (i <= j && arr[i] < pivot){i++;}
            // Move j to the left until we find an element less than or equal to the pivot
            while (i <= j && arr[j] > pivot) {j--;}
            // If i is still less than or equal to j, we need to swap the out-of-place elements and advance the pointers
            if (i <= j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        // Move the pivot to its final place
        swap(arr, left, j);

        // Return the final position of the pivot
        return j;
    }

    // Utility function to swap two elements in an array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // =========================== COUNTING SORT ================================

    // Helper method to print an array
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int FindMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i : arr) { min = Math.min(min, i); }
        return min;
    }

    public static void shift(int[] arr, int minValue) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += -minValue; // shifting up when minValue is negative
        }
    }

    // Stable Counting Sort with max value as parameter
    public static void countingSort(int[] arr, int maxValue) {
        // TODO: modify this to handle negative numbers

        int minValue = FindMin(arr);
        shift(arr, minValue);

        maxValue += -minValue;

        // create a count array and sorted array
        int[] countArray = new int[maxValue + 1];
        int[] sortedArray = new int[arr.length];

        // Step 1: Store the count of each element
        for (int i : arr) { countArray[i]++; }

        // Step 2: Calculate the running total (cumulative count)
        for (int i = 1; i < countArray.length; i++) { countArray[i] += countArray[i - 1]; }

        // Step 3: Build the sorted array in reverse for stability
        for (int i = arr.length - 1; i >= 0; i--) {
            //3a: get value to insert
            int value = arr[i];
            //3b: reduce counter
            countArray[value]--;
            //3c: get index to place value from reduced counter
            int index = countArray[value];
            //3d: insert value at sorted index
            sortedArray[index] = value;
        }

        shift(sortedArray, -minValue);

        // Step 4: Copy sorted array back to original array (hint: System.arraycopy(src, ind, targ, ind, len)
        System.arraycopy(sortedArray, 0, arr, 0, arr.length);
    }
}