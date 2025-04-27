package recursion;

public class PowerOfXn {

    public static double solution(double x, long n) {
        if (n == 0) {
            return 1.00;
        }
        double half = solution(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }

//    public static double solution(double x, long n) {
//        double mult = 1;
//        int range = (int) Math.abs(n) / 2;
//        for (int i = 1; i <= range; i++) {
//            mult = mult * x;
//        }
//        if (n % 2 == 0) {
//            return mult * mult;
//        } else {
//            return mult * mult * x;
//        }
//    }


    public static double powXn(double x, int n) {
        long N = n;
        if (N > 0) {
            return solution(x, N);
        }
        return 1 / solution(x, N);
    }

    public static void main(String[] args) {
        double x =  2.00000;
        int n = -2;
        System.out.println(powXn(x, n));
    }
}
