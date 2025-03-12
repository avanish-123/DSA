
import java.util.Arrays;

public class QuickSortRevision {
    static void swap(int[] arr, int indexOne, int indexTwo) {
        int temp = arr[indexOne];
        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = temp;
    }

    static int partition(int[] arr, int startIndex, int endIndex) {
        int pivotIndex = startIndex;
        int start = startIndex;
        int end = endIndex;
        while (start < end) {
            while (arr[start] <= arr[pivotIndex] && start < endIndex) {
                start++;
            }
            while (arr[end] > arr[pivotIndex] && end > startIndex) {
                end--;
            }
            if (start < end) {
                swap(arr, start, end);
            }
        }
        swap(arr, pivotIndex, end);
        return end;

    }

    static void quickSort(int[] arr, int startIndex, int endIndex) {
        if (startIndex >= endIndex)
            return;
        int partitionIndex = partition(arr, startIndex, endIndex);
        quickSort(arr, startIndex, partitionIndex - 1);
        quickSort(arr, partitionIndex + 1, endIndex);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 3, 2, 3, 6, 3, 2, 4, 5, 4, 3, 2, 33, 2, 2 };
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
