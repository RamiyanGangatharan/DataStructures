public class MergeSort {

  // Method to perform merge sort on an array
  public static void mergeSort(int[] array, int left, int right) {
    //if the array can be divided, divide, conquer, combine

  }

  // Method to merge two halves of the array
  public static void merge(int[] array, int left, int mid, int right) {
    // Sizes of two subarrays to be merged

    // Temporary arrays

    // Copy data to temp arrays

    // Initial indexes of first and second subarrays
    int i = 0, j = 0;

    // Initial index of the merged subarray
    int k = left;

    // merge by taking smallest of two values

    //take the rest of the left array

    //take the rest of the right array
    
  }

  // Main method to test the merge sort implementation
  public static void main(String[] args) {
    int[] array = new int[]{7,6,3,5,7,8,4,47,8,8655,7,8,65,7,86,54,46,7,8,6,54,5};
    printArray(array);
    mergeSort(array, 0, array.length-1);
    printArray(array);
  }

  // Utility method to print the elements of an array
  public static void printArray(int[] array) {
    for(int i : array) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}