package recursion;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 3, 9, 1};

        System.out.println("Original : ");
        System.out.println(Arrays.toString(arr));
        arr = mergeSort(arr);
        System.out.println("Sorted one : ");
        System.out.println(Arrays.toString(arr));
    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {
        int[] sortedArray = new int[left.length + right.length];
        int i = 0;
        int j = -0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                sortedArray[k] = left[i];
                i++;
            } else {
                sortedArray[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            sortedArray[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            sortedArray[k] = right[j];
            j++;
            k++;
        }
        return sortedArray;
    }
}
