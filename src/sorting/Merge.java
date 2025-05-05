package sorting;

public class Merge {

    public static int[] merge(int[] a, int start, int mid, int end) {


        int len1 = mid - 1;
        int len2 = end - mid;

        int[] leftArr = new int[len1];
        int[] rightArr = new int[len2];
        int[] res = new int[leftArr.length + rightArr.length];

        for (int x = 0; x < len1; x++) {
            leftArr[x] = a[start + x];
        }
        for (int x = 0; x < len2; x++) {
            rightArr[x] = a[mid + 1 + x];
        }

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] < rightArr[j]) {
                res[k++] = leftArr[i++];
            } else {
                res[k++] = rightArr[j++];
            }
        }
        while (i < a.length) {
            res[k++] = a[i++];
        }
        while (j < rightArr.length) {
            res[k++] = rightArr[j++];
        }
        return res;
    }

    public static void divide(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            divide(arr, start, mid);
            divide(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void print(int[] a) {
        for (int item : a) {
            System.out.print(" " + item);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 7, 3, 1};
        int start = 0;
        int end = arr.length - 1;

        System.out.println("Array : ");
        print(arr);

        divide(arr, start, end);

    }
}
