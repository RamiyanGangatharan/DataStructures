public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println(recursiveAddition(array, 0, array.length - 1));
    }

    /**
     * Recursively sums all elements in the array using divide and conquer.
     *
     * @param array the input array
     * @param low   the starting index
     * @param high  the ending index
     * @return the sum of elements between low and high
     */
    public static int recursiveAddition(int[] array, int low, int high) {
        if (low == high) { return array[low]; }
        else {
            int midpoint = (low + high) / 2;
            return recursiveAddition(array, low, midpoint) + recursiveAddition(array, midpoint + 1, high);
        }
    }
}
