
import java.util.Arrays;

public class LeftRotareAnArrayByNPlace {
    public static void main(String[] args) {
        //bruteforce method
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n = 12;
        int size = arr.length;
        if(n>size) n%=size;
        int[] temp = new int[size-n];
        for(int i = 0; i<size-n; i++){
            temp[i] = arr[i];
        }
        int a = 0;
        for(int j = size-n; j<arr.length; j++){
            arr[a++] = arr[j];
        }
        int b = 0;
        for(int k = n; k<size; k++){
            arr[k] = temp[b++];
        }
        System.err.println(Arrays.toString(arr));
    }
}
