package two_pointer;

import java.util.Arrays;

public class TargetIndices {

    public static int[] getIndex(int[] arr, int target) {

        int p1 = 0;
        int p2 = arr.length - 1;
        int[] res = {};

        for (int i = 0; i < arr.length; i++) {
            int sum = arr[p1] + arr[p2];
            if (sum == target) {
                res = new int[]{p1, p2};
                break;
            }
            if (sum > target) {
                p2 -= 1;
            } else {
                p1 += 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 10};
        int target = 10;
        System.out.println(Arrays.toString(getIndex(arr, target)));;
    }
}
