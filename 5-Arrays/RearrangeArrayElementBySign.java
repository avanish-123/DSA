
import java.util.Arrays;

public class RearrangeArrayElementBySign {
    static void swap(int[] arr, int indexOne, int indexTwo){
        int temp = arr[indexOne];
        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = temp; 
    }
    public static void main(String[] args) {
        // for equal no of positive and negation elements
        int[] arr = { 3, 1, -2, -5, 2, -4 };
        // bruteforce
        int[] result = new int[arr.length];
        int positiveElementIndex = 0;
        int negativePointerIndex = 1;
        for (int ele : arr) {
            if (ele >= 0) {
                result[positiveElementIndex] = ele;
                positiveElementIndex += 2;
            } else {
                result[negativePointerIndex] = ele;
                negativePointerIndex += 2;

            }
        }
        System.out.println(Arrays.toString(result));

        // for un-equal for of positive and negative elements without order
        int nums[] = { 1, 2, -2, -3, -4, 3, 5, -2, -7, -8, 2, -4, -5, -6};
        int res[] = new int[nums.length];
        int resultLeft = 0;
        int resultRight = nums.length-1;
        int noOfPositive = 0;
        int noOfNegative = 0;
        int left = 0;
        int right = nums.length-1;
        while(right>left){
            if(nums[left]>=0){
                res[resultLeft++] = nums[left++];
            }else if(nums[left]<0){
                res[resultRight--] = nums[left++];
            }
            if(nums[right]>=0){
                res[resultLeft++] = nums[right--];
            }else if(nums[right]<0){
                res[resultRight--] = nums[right--];
            }
        }
        System.out.println(Arrays.toString(res));
        System.out.println(resultLeft);
        System.out.println(res.length-1 - resultRight);
        // HW


    }
}
