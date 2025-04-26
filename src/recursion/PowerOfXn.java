package recursion;

public class PowerOfXn {

    public static double solution(double x, int n) {
        double mult = 1;
        int range = Math.abs(n);
        for (int i = 1; i <=range ; i++) {
            mult=mult*x;
        }
        System.out.println(mult);
        return mult;
    }

    public static double powXn(double x, int n) {
        if (n > 0) {
            return solution(x, n);
        }
        return 1 / solution(x, n);
    }

    public static void main(String[] args) {
        double x =  2.00000;
        int n = -2;
        System.out.println(powXn(x, n));
    }
}
