package recursion;

public class PowerOfTwo {



    public static boolean powTwo(int n) {
       if (n==1)
       {
           return true;
       }
       if (n < 1 || n%2 != 0)
       {
           return false;
       }
       return powTwo(n/2);
    }

    public static void main(String[] args) {
        int n =0;
        System.out.println(powTwo(n));;
    }
}
