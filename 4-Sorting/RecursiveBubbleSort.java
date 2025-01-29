
import java.util.Arrays;

public class RecursiveBubbleSort {
    static void swap(int arr[], int indexOne, int indexTwo) {
        int temp = arr[indexOne];
        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = temp;
    }

    static void bubbleSort(int arr[], int start, int end) {
        if (start >= end)
            return;
        boolean isSwaped = false;
        for (int i = start; i < end; i++) {
            if (arr[i] >= arr[i + 1]) {
                swap(arr, i, i + 1);
                isSwaped = true;
            }
        }
        if (isSwaped == false)
            return;
        bubbleSort(arr, start, end - 1);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2 };
        bubbleSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
