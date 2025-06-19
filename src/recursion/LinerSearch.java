package recursion;

public class LinerSearch {

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 4, 7, 8, 9};
        int target = 4923;
        System.out.println(findTarget(arr, target, 0));
    }

    public static boolean findTarget(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return target == arr[index] || findTarget(arr, target, index + 1);
    }
}
