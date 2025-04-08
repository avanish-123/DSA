public class BinarySearchExample {
    // iterative
    static int bs(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        while(high>=low){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }

    static int bsr(int[] arr,int target, int low, int high){
        if(high<low) return -1;
        int mid = (low+high)/2;
        if(arr[mid] == target) return mid;
        else if(arr[mid]>target) return bsr(arr, target, low, mid-1);
        return bsr(arr, target, mid+1, high);
    }
    public static void main(String[] args) {
        int []arr = {3,4,6,7,9,12,16,17};
        int target = 13;
        System.out.println(bs(arr, target));
        System.out.println(bsr(arr, target, 0, arr.length-1));
       
    }
}
