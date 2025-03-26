
import java.util.ArrayList;
import java.util.List;

public class LeaderInAnArray {
    public static void main(String[] args) {
        int[] arr = { 10, 9, 13, 15, 14, 8, 6, 7, 5, 2 };
        List<Integer> arrayList = new ArrayList<>();
        int max = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                max = Math.max(arr[i], max);
                arrayList.add(max);
            }
        }
        System.out.println(arrayList);

    }
}