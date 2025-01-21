import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(int[] arr){
        for(int i = arr.length; i>0; i--){
            boolean isSwaped = false;
            for(int j = 0; j<i-1; j++){
                if(arr[j]>arr[j+1]){
                    isSwaped = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                }
            }
            if(!isSwaped) break;
        }
    }
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));     
        
    }
}
