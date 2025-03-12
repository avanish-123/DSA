import java.util.Arrays;

public class LeftRotateByKPlace {
    static void swap(int[] arr, int indexOne, int indexTwo) {
        int temp = arr[indexOne];
        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = temp;
    }

    static void rotate(int[] arr, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            swap(arr, startIndex, endIndex);
            startIndex++;
            endIndex--;
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 10;
        int size = arr.length;
        int rotatingIndex = k > size ? k % size : k;
        rotate(arr, 0, rotatingIndex - 1);
        rotate(arr, rotatingIndex, arr.length - 1);
        rotate(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }
}
