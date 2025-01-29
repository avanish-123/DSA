import java.util.Arrays;

public class RecursiveInsertionSort {
    static void swap(int arr[], int indexOne, int indexTwo) {
        int temp = arr[indexOne];
        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = temp;
    }

    static void insertionSort(int arr[], int start, int end) {
        if (end > arr.length - 1)
            return;
        for (int i = end; i > 0 && arr[i - 1] > arr[i]; i--) {
            swap(arr, i, i - 1);
        }
        insertionSort(arr, start, end + 1);

    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 3, 2, 3, 12, 43, 23, 4, 3, 2, 2, 111, 3, 4 };
        insertionSort(arr, 0, 0);
        System.out.println(Arrays.toString(arr));

    }
}
