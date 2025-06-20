package recursion;

import java.util.ArrayList;

public class AllTargetIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1, 3, 4, 2, 3};
        int target = 4;
        System.out.println(indexList(arr, target, 0, new ArrayList<>()));
    }

    public static ArrayList<Integer> indexList(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (target == arr[index]) {
            list.add(index);
        }
        return indexList(arr, target, index + 1, list);
    }
}
