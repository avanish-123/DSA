
import java.util.Arrays;

public class InsertionSort {
    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
