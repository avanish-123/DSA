
import java.util.Arrays;

public class SortColors {
    static void swap(int[] arr, int indexOne, int indexTwo){
        int temp = arr[indexOne];
        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = temp;
    }
    public static void main(String[] args) {
        // desc sort 0,1,2
        int []arr = {0,1,2,0,1,2,1,2,0,0,0,1};
        
        // Bruteforce sort the array TC(NLogN)

        // better TC O(N + N)
        int ZeroCount = 0;
        int OneCount = 0;
        int twoCount = 0;
        for(int i = 0; i<arr.length; i++){
            switch (arr[i]) {
                case 0:
                    ZeroCount++;
                    break;
                case 1:
                    OneCount++;
                    break;
                default:
                    twoCount++;
                    break;
            }
        }
        for(int j = 0; j<arr.length; j++){
            if(ZeroCount>0){
                arr[j] = 0;
                ZeroCount--;
            }else if(OneCount>0 && ZeroCount<=0){
                arr[j] = 1;
                OneCount--;
            }else {
                arr[j] = 2;
                twoCount--;
            }
        }
        System.out.println(Arrays.toString(arr));


        // optimal TC O(n) SC O(1)
        // Datch national flag algo
        int []nums = {0,1,2,0,1,2,1,2,0,0,0,1};
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums, low++, mid++);
            }else if(nums[mid]==1){
                mid++;
            }else{
                swap(nums, mid, high--);
            }
        }
        System.out.println(Arrays.toString(nums));
        
    }
    
}
