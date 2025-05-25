package recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int [] nums = {1,3,4,6,7,8,9};
        int left = 0;
        int right = nums.length;
        search(nums,left,right);
    }

    public static void search(int [] arr, int left,int right)
    {
        System.out.println("Not Found");
    }
}
