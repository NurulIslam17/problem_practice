package recursion;

public class DigitSUm {
    public static void main(String[] args) {
        int  num = 12345;
        int res = solution(num);
        System.out.println(res);
    }

    public static int solution(int num) {
        if (num==0)
        {
            return num;
        }
        return (num%10)+solution(num/10);
    }
}
