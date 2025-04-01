
import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int []nums = { 15, 6, 2, 1, 16, 4, 2, 29, 9, 12, 8, 5, 14, 21, 8, 12, 17, 16, 6, 26, 3  };
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int maxCountOfSeries = 0;
        int maxOcc = 1;
        for(int i = 1; i<nums.length; i++){
            if(nums[i] == nums[i-1]+1){
                maxCountOfSeries = Math.max(maxCountOfSeries, ++maxOcc);
            }else if(nums[i] != nums[i-1]+1 && nums[i] != nums[i-1]){
                maxOcc = 1;
            }
        }
        System.out.println(maxCountOfSeries);









        // optimal TC O(3n) SC O(n) its optimal becouse we are not changing the given array
        int arr[] = { 102, 4, 103, 101, 3, 2, 1, 1, 105, 104, 106 };
        HashSet<Integer> set = new HashSet<>();
        for (int el : arr) {
            set.add(el);
        }
        int maxCount = 0;
        for (int stEl : set) {
            int max = 1;
            int minVal = stEl;
            if (!set.contains(stEl - 1)) {
                while (set.contains(minVal + 1)) {
                    max++;
                    minVal++;
                }

            }
            maxCount = Math.max(maxCount, max);
        }
        System.out.println(maxCount);

    }
}
