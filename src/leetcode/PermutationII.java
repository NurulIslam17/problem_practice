package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PermutationII {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> resultList = new ArrayList<>();
        backtrack(resultList, new ArrayList<>(), nums);
        System.out.println(resultList);
    }

    private static List<List<Integer>> backtrack(List<List<Integer>> resultList, ArrayList<Integer> arrayList, int[] nums) {

        if (resultList.size() == nums.length)
        {
            resultList.addLast(new ArrayList<>(arrayList));
            return resultList;
        }

        for (int num : nums) {
            if (arrayList.contains(num)) {
                continue;
            }
            arrayList.add(num);
            backtrack(resultList, arrayList, nums);
            arrayList.remove(arrayList.size() - 1);
        }
        return resultList;
    }
}
