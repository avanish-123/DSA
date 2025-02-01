
import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 10, 10, 10, 10 };
        int i = 0;
        int j = 1;
        while (i < arr.length - 1 && j < arr.length) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
            j++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(i);
        // using for loop
        int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int l = 0;
        for (int k = l + 1; k < arr2.length; k++) {
            if (arr2[l] != arr2[k]) {
                arr2[l + 1] = arr2[k];
                l++;
            }
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println(l);
    }
}
