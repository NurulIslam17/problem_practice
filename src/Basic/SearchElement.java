package Basic;

public class SearchElement {

    public static void seachElement(int t, int[] a) {
        boolean flag = false;
        for (int j : a) {
            if (t == j) {
                flag = true;
                break;
            }
        }
        if (flag){
            System.out.println(t+" is found.");
        }else {
            System.out.println(t+" not present in collection.");
        }
    }

    public static void main(String[] args) {
        int target = 2;
        int[] arr = {2, 3, 6, 2, 4, 2};
        seachElement(target, arr);
    }
}
