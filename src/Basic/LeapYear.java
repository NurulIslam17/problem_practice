package Basic;

public class LeapYear {

    public static void chackLeapYear(int y) {
        boolean isLeapYear = false;
        if (y % 4 == 0 && y % 100 != 0) {
            isLeapYear = true;
        }
        if (y % 100 == 0 && y % 400 == 0) {
            isLeapYear = true;
        }
        if (isLeapYear) {
            System.out.println(y + " is a Leap Year.");
        } else {
            System.out.println(y + " is not a Leap Year.");
        }
    }

    public static void main(String[] args) {
        chackLeapYear(2000);
    }
}
