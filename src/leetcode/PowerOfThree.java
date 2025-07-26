package leetcode;

public class PowerOfThree {

    public static void main(String[] args) {
        int number = 27;
        System.out.println(isPowerOfThree(number));
    }

    public static boolean isPowerOfThree(int number) {
        if (number <=0) {
            return false;
        }
        if (number == 1) {
            return true;
        }
        if (number%3==0) {
            return isPowerOfThree(number / 3);
        }
        return false;
    }


}
