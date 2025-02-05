
import java.util.HashMap;

public class LongestSubArrayWithSumKAllNum {
    public static void main(String[] args) {

        int[] arr = { 2, 1, 4, 5, 2, 6 };
        int k = 12;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int sum = 0;
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum == k) {
                maxLength = Math.max(maxLength, i + 1);
            }
            int rem = sum - k;
            mpp.put(sum, i);
            if (mpp.get(rem) != null) {
                int length = i - mpp.get(rem);
                if (length > maxLength)
                    maxLength = length;
            }
        }
        System.out.println(maxLength);
        System.out.println(mpp);
    }
}
