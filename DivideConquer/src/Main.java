public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] array = {2, 7, 11, 64, 12, 88, 200};
        System.out.println(divideConquer(array, 0, array.length - 1));
    }

    /**
     * Recursively finds and returns the smallest element in an integer array
     * using the divide and conquer approach.
     *
     * The method divides the array into two halves until only one element remains
     * (base case). Then, it compares the minimum values of each half and returns
     * the smaller of the two. This process continues up the recursive call stack
     * until the overall minimum value is determined.
     *
     * @param array the input array of integers
     * @param low the starting index of the current sub-array
     * @param high the ending index of the current sub-array
     * @return the minimum value found in the array between indices low and high
     */
    public static int divideConquer(int[] array, int low, int high)
    {
        if (low == high) { return array[low]; }
        else {
            int midpoint = (low + high) / 2;
            return Math.min(
                divideConquer(array, low, midpoint),
                divideConquer(array, midpoint + 1, high)
            );
        }
    }
}