public class LargestElementInAnArray {
    // for arr[i]>1
    static int largestNumber(int arr[]) {
        int maxNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            }
        }

        return maxNum;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 2, 1, 2, 344, 2, 3, 45, 55 };
        System.out.println(largestNumber(arr));
    }
}
