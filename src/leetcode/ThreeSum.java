package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
    private static void calculateThreeSum(int[] arr) {
        HashSet<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;
            int sum = arr[i] + arr[left] + arr[right];
            while (left < right) {
                if (sum == 0) {
                    result.add(Arrays.asList(arr[i], arr[left], arr[right]));
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] arr = {-4, -1, -1, 0, 1, 2};
        calculateThreeSum(arr);
    }
}
