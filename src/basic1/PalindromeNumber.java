package basic1;

public class PalindromeNumber {

    public static int getReverse(int num) {
        int rev = 0;
        while (num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return rev;
    }

    public static void checkPalindrome(int num) {
        getReverse(num);
        if (getReverse(num) == num) {
            System.out.println(num + " is Palindrome");
        } else {
            System.out.println(num + " is not a Palindrome");
        }
    }

    public static void main(String[] args) {
        int number = 101;
        checkPalindrome(number);
    }
}
