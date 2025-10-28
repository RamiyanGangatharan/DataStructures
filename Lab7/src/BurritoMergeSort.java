public class BurritoMergeSort {
    // CODE TAKEN FROM ACTIVITY 7B2

    public static int[] sort(int[] array, int left, int right) {
        //if the array can be divided, divide, conquer, combine
        if (left < right) {
            int midpoint = (left + right) / 2;
            sort(array, left, midpoint);
            sort(array, midpoint + 1, right);
            merger(array, left, midpoint, right);
        }
        return array;
    }

    public static void merger(int[] array, int left, int mid, int right) {
        // Sizes of two arrays to be merged
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

}
