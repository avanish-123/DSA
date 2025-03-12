public class LargestElementInAnArray {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 2, 5, 6, 7, 6, 5, 8, 99, 4 };
        int max = -1; // for arr[i]>0 use Integer.MIN_VALUE for negative value of arr[i]
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);

    }
}
