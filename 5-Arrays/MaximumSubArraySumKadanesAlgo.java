public class MaximumSubArraySumKadanesAlgo {
    public static void main(String[] args) {
        // better
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for(int j = i; j<arr.length; j++){
                sum+=arr[j];
                maxSum = Math.max(maxSum, sum);
            }

        }
        System.out.println(maxSum);


        // Optimal Kadane's Algo
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
            max = Math.max(sum, max); 
            if(sum < 0){
                sum = 0;
            }
        }
        System.out.println(max);
    }
}
