
import java.util.HashMap;
import java.util.Map;

public class Question2 {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 10, 15, 10, 5 };
        int size = arr.length;
        Map<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < size; i++) {
            if (mpp.containsKey(arr[i])) {
                mpp.put(arr[i], mpp.get(arr[i]) + 1);
            } else {
                mpp.put(arr[i], 1);
            }
        }
        int maxOccuredvalue = 0;
        int maxOccuredvalueFrequency = 0;
        int minOccuredValue = Integer.MAX_VALUE;
        int minOccuredValueFrequency = Integer.MAX_VALUE;
        System.out.println(mpp);
        for (Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
            int value = entry.getKey();
            int frequency = entry.getValue();
            if (frequency > maxOccuredvalueFrequency) {
                maxOccuredvalue = value;
                maxOccuredvalueFrequency = frequency;
            }
            if (frequency < minOccuredValueFrequency) {
                minOccuredValue = value;
                minOccuredValueFrequency = frequency;
            }
        }
        System.err.println(maxOccuredvalue + " " + maxOccuredvalueFrequency);
        System.out.println(minOccuredValue + " " + minOccuredValueFrequency);

    }
}
