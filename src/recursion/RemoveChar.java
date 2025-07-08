package recursion;

public class RemoveChar {
    public static void main(String[] args) {
        skip('d', "", "abccdaad");
    }

    public static void skip(char c, String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        if (ch == c) {
            skip(c, processed, unprocessed.substring(1));
        } else {
            skip(c, processed + ch, unprocessed.substring(1));
        }
    }
}
