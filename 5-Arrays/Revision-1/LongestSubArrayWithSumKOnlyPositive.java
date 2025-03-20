
public class LongestSubArrayWithSumKOnlyPositive {

    public static void main(String[] args) {
        // only for 0 and positive

        // bruteforce (approx n^3)
        int[] arr = { 2, 0, 0, -1, 3, 1 };
        int target = 3;
        int longest = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (sum == target) {
                    longest = Math.max(longest, j - i + 1);
                }
            }
        }
        System.out.println(longest);

        // better (approx n^2)
        int longestLen = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum > target) {
                    break;
                }
                if (sum == target) {
                    longestLen = Math.max(longestLen, j - i + 1);
                }

            }
        }
        System.out.println(longestLen);

        // optimal
        // Soon

    }
}
