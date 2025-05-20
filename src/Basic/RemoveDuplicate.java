package Basic;
import java.util.ArrayList;

public class RemoveDuplicate {

    public static ArrayList<Integer> solution(int[] numbers) {
        ArrayList<Integer> res  =  new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (res.contains(numbers[i]))
            {
                continue;
            }
            res.add(numbers[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int [] numbers = {1,2,3,2,3,4,6,3};
        System.out.println(solution(numbers));
    }
}
