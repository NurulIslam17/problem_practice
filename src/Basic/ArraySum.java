package Basic;

public class ArraySum {

    public static void printArraySum(int a[]) {
        int sum = 0;
        for (int j : a) {
            sum += j;
        }
        System.out.println("Element Sum Is : "+sum);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        printArraySum(arr);
    }
}
