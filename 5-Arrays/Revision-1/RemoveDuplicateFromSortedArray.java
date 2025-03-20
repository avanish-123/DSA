
import java.util.Arrays;

class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int left = 0;
        int right = 1;
        int size = arr.length - 1;
        while (left <= size && right <= size) {
            if (arr[left] != arr[right]) {
                arr[left + 1] = arr[right];
                left++;
            }
            right++;

        }
        System.out.println(Arrays.toString(arr));
    }
}