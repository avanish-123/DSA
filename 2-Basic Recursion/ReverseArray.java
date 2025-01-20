
import java.util.Arrays;

public class ReverseArray {
    // with two pointer
    static void reverse(int[] nums, int start, int end){
        if(start>end){
            return;
        }
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        reverse(nums, start+1, end-1);

    }

    // with single pointer
    static void reverse(int[] nums, int start){
        if(start> nums.length-1-start){
            return;
        }
        int temp = nums[start];
        nums[start] = nums[nums.length-1-start];
        nums[nums.length-1-start] = temp;
        reverse(nums, start+1);

    }
    public static void main(String[] args) {
        int[] nums1 = {1,3,2,4,5,6,7};
        int[] nums2 = {7,6,5,4,2,3,1};

        reverse(nums1, 0, nums1.length-1);
        reverse(nums2, 0);
        System.out.println(Arrays.toString(nums1));
        System.out.print(Arrays.toString(nums2));
    }
}
