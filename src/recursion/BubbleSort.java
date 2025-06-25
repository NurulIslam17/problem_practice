package recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 7, 6};
        sort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int i, int j) {
        if (i == 0) {
            return;
        }
        if (i > j) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
            sort(arr, i, j + 1);
        } else {
            sort(arr, i - 1, 0);
        }
    }
}
