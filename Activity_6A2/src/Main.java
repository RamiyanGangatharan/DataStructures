import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        System.out.println(result);
    }

    /**
     * This method generates all possible subsets (the power set) of a given array using backtracking.
     * It follows the recursive approach discussed in class, where each element can either be included
     * or excluded in a subset. The method systematically explores all possibilities.
     *
     * @param nums   The input array of integers.
     * @param index  The current position in the array being considered.
     * @param current The current subset being built during the recursion.
     * @param result  The list that stores all generated subsets.
     */
    public static void backtrack(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
        // BASE CASE: When we've reached the end of the array, add a copy of the current subset to the result list and return.
        if (index == nums.length) { result.add(new ArrayList<>(current)); return; }

        // RECURSIVE CASE 1: Exclude the current element and move to the next index.
        backtrack(nums, index + 1, current, result);

        // RECURSIVE CASE 2: Include the current element, then move to the next index.
        current.add(nums[index]);
        backtrack(nums, index + 1, current, result);

        // BACKTRACK STEP: Remove the last element before returning to explore other branches.
        current.remove(current.size() - 1);;
    }
}