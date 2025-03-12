
import java.util.Arrays;

public class MoveZerosToTheEnd {
    static void swap(int[] arr, int indexOne, int indexTwo) {
        int temp = arr[indexOne];
        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12 };
        int index = 0;
        for (int i = index + 1; i < arr.length; i++) {
            if (arr[index] != 0) {
                index++;
            }
            if (arr[index] == 0 && arr[i] != 0) {
                swap(arr, index, i);
                index++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
