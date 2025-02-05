
import java.util.Arrays;

public class LeftRotateAnArrayByNPlace {
    static void swap(int arr[], int indexOne, int indexTwo) {
        int temp = arr[indexOne];
        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = temp;
    }

    static void rotate(int arr[], int from, int to) {
        int left = from;
        int right = to;
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        // bruteforce method
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n = 3;
        int size = arr.length;
        if (n > size)
            n %= size;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }
        int a = 0;
        for (int j = n; j < size; j++) {
            arr[a++] = arr[j];
        }
        int b = 0;
        for (int k = size - n; k < size; k++) {
            arr[k] = temp[b++];
        }

        System.err.println(Arrays.toString(arr));

        // optimal
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n1 = 3;
        int size1 = arr1.length;
        if (n1 > size)
            n1 %= size1;
        rotate(arr1, 0, n1 - 1);
        rotate(arr1, n1, arr1.length - 1);
        rotate(arr1, 0, arr1.length - 1);
        System.err.println(Arrays.toString(arr1));
    }
}
