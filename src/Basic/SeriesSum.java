package Basic;

public class SeriesSum {

    public static int printSeriesSum(int r){
        int sum = 0;
        for (int i = 1; i <= r; i++) {
            System.out.print(i);
            if (i == r) {
                System.out.print(" = ");
            } else {
                System.out.print(" + ");
            }
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.println(printSeriesSum(100));
    }
}
