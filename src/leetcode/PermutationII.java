package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PermutationII {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), result);
        System.out.println(result);
    }

    private static void backtrack(int[] nums, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int num : nums) {
            if (current.contains(num)) continue; // skip duplicates in the same permutation path
            current.add(num);
            backtrack(nums, current, result);
            current.remove(current.size() - 1);
        }
    }
}
