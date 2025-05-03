package sorting;

public class Insertion {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j >= 0; j--) {
                if (arr[minIndex] < arr[j]) {
                    int temp = arr [minIndex];
                    arr[minIndex] = arr[j];
                    arr[j] = temp;
                    minIndex = j;
                }
            }
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 8, 5, 2, 3, 1, 4, 7, 9};
        sort(arr);
    }
}
