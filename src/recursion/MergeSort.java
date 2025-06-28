package recursion;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 2, 12, 1, 2, 1, 2, 4, 5, 2, 34, 2};
        System.out.println(mergeSort(arr));
    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length/2;

        int[] left = Arrays.copyOfRange(arr,0,mid);
        int[] right = Arrays.copyOfRange(arr,mid,arr.length);
        mergr()
    }
}
