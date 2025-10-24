import java.util.Arrays;

public class QuickSort {

  public static void quickSort(int[] arr, int left, int right) {
    // make sure there is something still to sort (not a single element)

      // partition the array


      //recursively sort two partitions


  }


  public static int partition(int[] arr, int left, int right) {
    //use the left value as the pivot

    // Start from the element right after the pivot
    // Start from the end of the array

    // while there are still values left to compare

      // Move i to the right until we find an element greater than or equal to the pivot

      // Move j to the left until we find an element less than or equal to the pivot

      // If i is still less than or equal to j, we need to swap the out-of-place elements and advance the pointers



    // Move the pivot to its final place

    // Return the final position of the pivot
    return 0;
  }

  // Utility function to swap two elements in an array
  public static void swap(int[] arr, int i, int j) {

  }

  public static void main(String[] args) {
    int[] arr = new int[]{3,6,4,5,7,1,2};
    System.out.println("Original: " + Arrays.toString(arr));
    quickSort(arr,0,arr.length-1);
    System.out.println("Sorted: " + Arrays.toString(arr));
  }


}