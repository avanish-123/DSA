
import java.util.Arrays;

public class MaximumSubArraySumKadanesAlgoWithIndexes {
    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        // int[] arr = { -2, -3, -1, -2};
        int maxSum = Integer.MIN_VALUE;
        int startIndex = -1;
        int endIndex = -1;
        for(int i = 0; i<arr.length; i++){
            int sum = 0;
            for(int j = i; j<arr.length; j++){
                sum +=arr[j];
                if(sum>maxSum){
                    startIndex = i;
                    endIndex = j;
                    maxSum = sum;
                }
            }

        }
        System.out.println(Arrays.asList(maxSum, startIndex, endIndex));


        // optimal using Kadane's algo
        // int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int start = -1;
        int  end = -1;
        for(int i = 0; i<arr.length; i++){
            if(sum==0){
                start = i;
            }
            sum += arr[i];
            if(max<sum){
                max = sum;
                end = i;
            }
            if(sum<0){
                sum = 0;
            }
        }
        System.out.println(Arrays.asList(max ,start, end));

    }
}
