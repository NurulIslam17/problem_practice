package recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 2, 1};
        sort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return;
        }
        if (r > c) {
            if (arr[max] < arr[c]) {
                sort(arr, r, c + 1, c);
            } else {
                sort(arr, r, c + 1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;
            sort(arr, r - 1, 0, 0);
        }
    }
}
