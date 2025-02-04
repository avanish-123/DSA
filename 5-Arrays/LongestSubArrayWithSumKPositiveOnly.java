public class LongestSubArrayWithSumKPositiveOnly {
    public static void main(String[] args) {
        // brute force
        int arr[] = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int k = 10;
        int arrSize = arr.length;
        int length = 0;
        for (int i = 0; i < arrSize; i++) {
            int sum = 0;
            for (int j = i; j < arrSize; j++) {
                sum = sum + arr[j];
                if (sum > k) {
                    break;
                }
                if (sum == k) {
                    if (j - i + 1 > length) {
                        length = j - i + 1;

                    }
                    break;
                }

            }
        }
        System.out.println(length);
    }
}
