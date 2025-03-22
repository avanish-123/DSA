
import java.util.Map;
import java.util.TreeMap;

public class MejorityElements {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 3, 3, 1, 2, 2 };
        // Better TC (O(n + nlogn (for map))) SC O(N)
        Map<Integer, Integer> mpp = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (mpp.containsKey(arr[i])) {
                int count = mpp.get(arr[i]);
                mpp.put(arr[i], count + 1);
            } else {
                mpp.put(arr[i], 1);
            }
        }
        int max = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> ele : mpp.entrySet()) {
            if (ele.getValue() > max) {
                max = ele.getKey();
            }
        }
        System.out.println(max);

        // optimal by Moore's voting algorithm
        int element = 0;
        int count = 0;
        for (int ele : arr) {
            if (count == 0) {
                element = ele;
            }
            if (ele == element) {
                count++;
            } else {
                count--;
            }
        }
        System.out.println(element);

    }
}
