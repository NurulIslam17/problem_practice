package leetcode;

import java.util.ArrayList;

public class DiceThrow {

    public static void main(String[] args) {
        System.out.println(solution("", 5));
    }

    public static ArrayList<String> solution(String processed, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(solution(processed + i, target - i));
        }
        return list;
    }
}
