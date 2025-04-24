package recursion;

public class FibonacciSeries {

    public static int getFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return getFibonacci(n - 1) + getFibonacci(n - 2);
        }
    }

    public static void printSeries(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(getFibonacci(i) + " ");
            ;
        }
    }

    public static void main(String[] args) {
        int number = 10;
        printSeries(number);
    }
}
