package leetcode;

public class ThreeSumClosest {

    private static int calculateClosestSum(int[] arr, int target) {
        int resultSum = arr[0] + arr[1] + arr[2];
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;
            int sum = arr[i] + arr[left] + arr[right];
            if (sum == target) {
                return sum;
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
            int targetToDiff = Math.abs(sum - target);
            if (targetToDiff < minDiff) {
                resultSum = sum;
                minDiff = targetToDiff;
            }
        }
        return resultSum;
    }

    public static void main(String[] args) {
        int[] arr = {-4, -1, 1, 2};
        int target = 1;
        System.out.println(calculateClosestSum(arr, target));
        ;
    }
}
