public class SecondLargestelementInAnArray {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 2, 5, 6, 7, 6, 5, 8, 99, 4 };
        int max = -1;
        int secMax = -2;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            }
            if (arr[i] < max && arr[i] > secMax) {
                secMax = arr[i];
            }
        }
        System.out.println(secMax);
    }
}
