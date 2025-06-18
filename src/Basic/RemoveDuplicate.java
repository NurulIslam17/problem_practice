package Basic;

import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 3, 4, 8, 9, 7, 4, 3, 4, 6, 6, 2, 2, 3};
        helper(arr);
    }

    public static void helper(int[] arr) {
        HashSet<Integer> result = new HashSet<>();
        for (int j : arr) {
            result.add(j);
        }
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}