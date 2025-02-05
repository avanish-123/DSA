
import java.util.Arrays;

public class RightRotateArrayByNPlaces {
    static void swap(int arr[], int indexOne, int indexTwo) {
        int temp = arr[indexOne];
        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = temp;
    }

    static void reverse(int arr[], int to, int from) {
        int left = to;
        int right = from;
        while (left < right) {
            swap(arr, left++, right--);
        }
    }

    public static void main(String[] args) {
        // bruteforce
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int n = 2;
        int size = arr.length;
        if (n > size)
            n %= size;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[size - n + i];
        }
        int a = size - 1;
        for (int j = size - n - 1; j >= 0; j--) {
            arr[a--] = arr[j];
        }
        for (int k = 0; k < temp.length; k++) {
            arr[k] = temp[k];
        }
        System.out.println(Arrays.toString(arr));

        // optimal
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8 };
        // n same as above
        int size1 = nums.length;
        reverse(nums, 0, size1 - n - 1);
        reverse(nums, size1 - n, size1 - 1);
        reverse(nums, 0, size1 - 1);
        System.out.println(Arrays.toString(nums));
    }
}
