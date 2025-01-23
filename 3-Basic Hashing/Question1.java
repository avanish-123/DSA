
import java.util.Arrays;

	
// Counting frequencies of array elements
public class Question1 {
    public static void main(String[] args) {
        // int[] arr = {2, 3, 2, 3, 5};
        int[] arr = {3,3,3,3,3};
        // int[] arr = {1};
        int size = arr.length;
        int[] result = new int[size];
        for(int i = 0; i<size; i++){
            result[arr[i]-1]++;
        }

        System.out.println(Arrays.toString(result));

        
    }
}
