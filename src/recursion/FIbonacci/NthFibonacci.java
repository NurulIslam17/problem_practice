package recursion.FIbonacci;

public class NthFibonacci {

    public static int printFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return printFibonacci(n - 1) + printFibonacci(n - 2);
    }

    public static void main(String[] args) {
        int number = 10;
        System.out.println(printFibonacci(number));
        ;
    }
}
