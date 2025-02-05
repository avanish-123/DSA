public class CountMaximumConsecutiveOneInAnArray {
    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0 };
        int size = arr.length;
        int maxOccurence = 0;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == 0) {
                count = 0;
            }
            if (arr[i] == 1) {
                count++;
            }
            if (count > maxOccurence) {
                maxOccurence = count;
            }
        }
        System.out.println(maxOccurence);
    }
}
