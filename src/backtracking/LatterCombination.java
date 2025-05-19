package backtracking;

public class LatterCombination {

    public static void main(String[] args) {
        String digit = "23";
        letterCombination(digit);
    }

    private static void letterCombination(String digit) {
        String[] charMap = new String[] {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        for (int i = 0; i < digit.length(); i++) {
            System.out.println(digit.charAt(i));
        }
    }

}
