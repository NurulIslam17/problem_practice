package recursion;

public class Factorial {

    public static int calculateFactorial(int n) {
        if (n > 1) {
            return calculateFactorial(n - 1) * n;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial of " + number + " is = " + calculateFactorial(number));
    }
}
