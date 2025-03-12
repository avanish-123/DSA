public class SecondSmallestElementInAnArray {
    public static void main(String[] args) {
        int[] arr = { 0, 0, 4, 1, 2, 5, 6, 7, 6, 5, 8, 99, 4 };
        int smallest = Integer.MAX_VALUE - 1;
        int secSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest && arr[i] < secSmallest) {
                secSmallest = arr[i];
            }
        }
        System.out.println(secSmallest);
    }
}
