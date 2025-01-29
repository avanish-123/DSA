
import java.util.Arrays;

public class RecursiveBubbleSort {
    static void swap(int arr[], int indexOne, int indexTwo){
        int temp = arr[indexOne];
        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = temp;
    } 
    static void bubbleSort(int arr[], int start, int end){
        if(start>=end) return;
        for(int i = start; i<end; i++){
            if(arr[i]>=arr[i+1]){
                swap(arr, i, i+1);
            }
        }
        bubbleSort(arr, start, end-1);

    }
    public static void main(String[] args) {
        int[] arr = {3,2,3,4,2,1,3,4,54,22,3,4232};
        bubbleSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

        

    }
}
