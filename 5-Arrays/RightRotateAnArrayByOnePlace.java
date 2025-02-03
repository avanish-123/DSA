
import java.util.Arrays;

public class RightRotateAnArrayByOnePlace {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int size = arr.length;
        int temp = arr[size - 1];
        for (int i = size - 1; i > 0; i--) {
            arr[i] = arr[i - 1];

        }
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
