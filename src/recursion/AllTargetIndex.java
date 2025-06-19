package recursion;

import java.util.ArrayList;

public class AllTargetIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1, 3, 4, 4, 4, 2, 3};
        int target = 4;
        indexList(arr, target, 0);
    }


    static ArrayList<Integer> list = new ArrayList<>();

    public static void indexList(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (target == arr[index]) {
            list.add(index);
        }
        indexList(arr, target, index + 1);
    }
}
