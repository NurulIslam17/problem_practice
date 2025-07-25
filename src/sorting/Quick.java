package sorting;

import java.util.Arrays;

public class Quick {


    public static int partition(int[] a, int l, int h) {
        int pivot = a[l];
        int i = l;
        int j = h;
        while (i < j) {
            do {
                i++;
            } while (i < h && a[i] <= pivot);

            while (a[j] > pivot) {
                j--;
            };
            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int pv = a[l];
        a[l] = a[j];
        a[j] = pv;
        return j;
    }

    public static void quickSort(int[] a, int l, int h) {
        if (l < h) {
            int pivotIndex = partition(a, l, h);
            quickSort(a, l, pivotIndex);
            quickSort(a, pivotIndex + 1, h);
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 8, 2, 6, 4, 7, 3, 1, 5};
        int n = arr.length;
        quickSort(arr, 0, n - 1);

        System.out.println(Arrays.toString(arr));

    }
}
