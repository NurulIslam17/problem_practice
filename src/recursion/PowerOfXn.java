package recursion;

public class PowerOfXn {

    public static double solution(double x, int n) {
        double mult = 1;
        for (int i = 1; i <=n ; i++) {
            mult=mult*x;
        }
        return mult;
    }

    public static double powXn(double x, int n) {
        if (n > 0) {
            return solution(x, n);
        }
        return 1 / solution(x, n);
    }

    public static void main(String[] args) {
        double x = 2.100;
        int n = 3;
        System.out.println(powXn(x, n));
    }
}
