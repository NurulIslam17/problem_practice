package sorting;

public class Selection {

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int maxIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[maxIndex] > arr[j]) {
                    maxIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex]=temp;
        }


        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 2, 5, 3, 9};
        selectionSort(arr);
    }
}
