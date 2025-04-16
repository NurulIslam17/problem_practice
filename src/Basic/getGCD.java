package Basic;

public class getGCD {

    public static int getGcd(int a, int b) {
        int gcd = 1;
        int i = 1;
        for (int j = 1; j < 1000; j++) {
            if (a % j == 0 && b % j == 0) {
                gcd = j;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        System.out.println(getGcd(30, 48));
    }
}
