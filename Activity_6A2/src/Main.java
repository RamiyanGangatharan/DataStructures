import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        System.out.println(result);
    }

    static void backtrack(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
        // BASE
        if (index == nums.length) { result.add(new ArrayList<>(current)); return; }

        backtrack(nums, index + 1, current, result);
        current.add(nums[index]);
        backtrack(nums, index + 1, current, result);
        current.remove(current.size() - 1);
    }
}