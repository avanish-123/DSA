public class SecondSmallestInAnArray {
    public static void main(String[] args) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE - 1;
        int[] arr = { 3, 4, 5, 6, 1, 7, 21, 8, 5, 4, 3, 1, 2 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        System.out.println(secondSmallest);
    }
}
