
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,6,7,5,4,3};
        for(int i = 0; i<arr.length-1; i++){
            int minIndex = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.err.println(Arrays.toString(arr));  
    }
}
