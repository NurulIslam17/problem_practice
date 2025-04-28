package recursion;

public class NumberOfDigitOne {

    public static int getOne(int n) {
        int totalOne = 0;
        while (n != 0) {
            int digit = n % 10;
            if (digit == 1) {
                totalOne += 1;
            }
            n = n / 10;
        }
        return totalOne;
    }

    public static void solution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count = count + getOne(i);
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int n = 13;
        solution(n);

    }
}
