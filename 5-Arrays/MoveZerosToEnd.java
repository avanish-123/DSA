
import java.util.ArrayList;
import java.util.Arrays;

public class MoveZerosToEnd {
    static void swap(int arr[], int indexOne, int indexTwo) {
        int temp = arr[indexOne];
        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 1, 2, 3, 40, 5, 4, 3, 0, 0, 4, 0, 1, 2, 3 };
        // bruteForce
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp.add(arr[i]);
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (j < temp.size()) {
                arr[j] = temp.get(j);
            } else {
                arr[j] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));

        // optimal
        int[] nums = { 0, 0, 0, 0, 0, 5, 6, 7 };
        int i = 0;
        int j = 0;
        int size = nums.length;
        while ((i < size && j < size) || j < size) {
            if (nums[i] != 0 && nums[j] != 0) {
                i++;
            }
            if (nums[j] != 0) {
                swap(nums, i, j);
                i++;
            }
            j++;
        }
        System.out.println(Arrays.toString(nums));

    }
}
