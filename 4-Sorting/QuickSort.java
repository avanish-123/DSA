
import java.util.Arrays;

public class QuickSort {
    static void swap(int[] arr, int indexOne, int indexTwo) {
        int temp = arr[indexOne];
        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = temp;
    }

    static int partition(int[] arr, int low, int high) {
        int i = low;
        int j = high;
        int pivot = low;
        while (i < j) {
            while (arr[pivot] >= arr[i] && i < high) {
                i++;
            }
            while (arr[pivot] < arr[j] && j > low) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, pivot, j);
        return j;

    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 2, 32, 1, 3, 5, 6, 4, 23 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }
}
