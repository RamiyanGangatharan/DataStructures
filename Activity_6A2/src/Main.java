import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        List<List<Integer>> results = generateSubsets(nums);
        System.out.println("The subsets of " + Arrays.toString(nums) + " is: " + results);
    }

    /**
     * Generates all possible subsets (the power set) of a given integer array.
     * Each subset is built by iteratively adding the current number to existing subsets.
     * Mathematically, for an array of length n, there are 2^n possible subsets.
     * This method starts with the empty subset and, for each number in the array,
     * creates new subsets by adding that number to every existing subset.
     *
     * @param nums an array of integers
     * @return a list containing all possible subsets of the input array
     */
    public static List<List<Integer>> generateSubsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>()); // empty set

        for (int num : nums) {
            List<List<Integer>> newSubsets = new ArrayList<>();

            for (List<Integer> subset : subsets) {
                List<Integer> newSubset = new ArrayList<>(subset);
                newSubset.add(num);
                newSubsets.add(newSubset);
            }
            subsets.addAll(newSubsets);
        }
        return subsets;
    }
}