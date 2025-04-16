package Basic;

public class LcmCalculate {

    public static int getGcd(int a, int b) {
        int gcd = 1;

        for (int i = 1; i < 100; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static int getLcm(int a, int b) {
        return (a*b)/getGcd(a,b);
    }

    public static void main(String[] args) {
        System.out.println(getLcm(6,10));
    }
}
