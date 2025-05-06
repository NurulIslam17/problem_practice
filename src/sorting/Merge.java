package sorting;

public class Merge {

    public static void merge(int[] a, int start, int mid, int end) {

        int len1 = mid - start + 1;
        int len2 = end - mid;

        int[] leftArr = new int[len1];
        int[] rightArr = new int[len2];

        for (int x = 0; x < len1; x++) {
            leftArr[x] = a[start + x];
        }
        for (int x = 0; x < len2; x++) {
            rightArr[x] = a[mid + 1 + x];
        }
        int i = 0;
        int j = 0;
        int k = start;

        while (i < len1 && j < len2) {
            if (leftArr[i] < rightArr[j]) {
                a[k++] = leftArr[i++];
            } else {
                a[k++] = rightArr[j++];
            }
        }
        while (i < len1) {
            a[k++] = leftArr[i++];
        }
        while (j < len2) {
            a[k++] = rightArr[j++];
        }
    }

    public static void divide(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            divide(arr, start, mid);
            divide(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void printArray(int[] a) {
        for (int item : a) {
            System.out.print(" " + item);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 7, 3, 1};
        int start = 0;
        int end = arr.length - 1;

        System.out.println("Original Array: ");
        printArray(arr);

        divide(arr, start, end);

        System.out.println();
        System.out.println("Sorted Array: ");
        printArray(arr);
    }
}
