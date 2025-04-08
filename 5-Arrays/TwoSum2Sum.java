
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum2Sum {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 5, 8, 11 };
        int target = 14;

        // bruteforce TC O(n^2) SC O(1)
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    int[] res = new int[2];
                    res[0] = i;
                    res[1] = j;
                    System.out.println(Arrays.toString(res));
                    // return;
                }
            }
        }

        // Optimal using hashing TC O(NLogN) in worst of unordered case TC becomes O(N^2) SC O(N)
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (mpp.containsKey(target - arr[i])) {
                int[] res = new int[2];
                res[0] = mpp.get(target - arr[i]);
                res[1] = i;
                System.out.println(Arrays.toString(res));
                break;
            } else {
                mpp.put(arr[i], i);
            }
        }

    }

}
