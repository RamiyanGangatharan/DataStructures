public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 2, -3, -6, 5, 2, -4, 1, 3, 3, -3, 3, 3};
        int maxValue = 6;

        System.out.println("Original array:");
        printArray(arr);

        countingSort(arr, maxValue);

        System.out.println("Sorted array:");
        printArray(arr);
    }

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