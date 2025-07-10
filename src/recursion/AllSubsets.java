package recursion;

public class AllSubsets {

    public static void main(String[] args) {
        allSubsetGenerate("", "abcd");
    }

    public static void allSubsetGenerate(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.print(processed + " ");
            return;
        }
        char ch = unprocessed.charAt(0);
        allSubsetGenerate(processed + ch, unprocessed.substring(1));
        allSubsetGenerate(processed, unprocessed.substring(1));
    }
}
