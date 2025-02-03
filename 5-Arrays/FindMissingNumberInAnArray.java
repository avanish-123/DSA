public class FindMissingNumberInAnArray {
    public static void main(String[] args) {
        // n 0 to n
        int[] arr = {1,2,3,4,0,6,7,8};
        int n = arr.length;
        // sum of first n integers
        int totalsum = n*(n+1)/2;
        int arrSum = 0;
        for(int i = 0; i<n; i++){
            arrSum+=arr[i];
        }
        System.out.println(totalsum-arrSum);
    }
}
