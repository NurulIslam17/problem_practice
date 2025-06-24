package recursion;

public class Pattern1 {
    public static void main(String[] args) {
        solve(7, 0);
    }

    public static void solve(int r, int c) {
        if (r == 0) {
            return;
        }
        if (r > c) {
            System.out.print("* ");
            solve(r, c + 1);

        } else {
            System.out.println();
            solve(r - 1, 0);

        }
    }
}
