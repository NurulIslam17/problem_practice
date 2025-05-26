package recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 6, 7, 8, 9};
        int target = 8;
        System.out.println(search(nums, target, 0, nums.length - 1));
    }

    public static int search(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = left + right-left / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (target>arr[mid]) {
            return search(arr, target, mid + 1, right);
        } else {
            return search(arr, target, left, mid - 1);
        }
    }
}
