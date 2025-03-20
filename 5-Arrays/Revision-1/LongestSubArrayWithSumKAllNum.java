
import java.util.HashMap;

public class LongestSubArrayWithSumKAllNum {

    public static void main(String[] args) {
        //for positive, zeros and negative
        int[] arr = { 2, 0, 0, -1, 3, 1 };
        int target = 3;
        // optimal
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int sum = 0;
        int longestIndexLen = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == target) {
                longestIndexLen = Math.max(longestIndexLen, i + 1);
            }
            if (mpp.get(sum) == null) {
                mpp.put(sum, i);
            }
            int rem = sum - target;
            if (mpp.get(rem) != null) {
                longestIndexLen = Math.max(longestIndexLen, i - mpp.get(rem));
            }
        }
        System.out.println(longestIndexLen);

    }
}
