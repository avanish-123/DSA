
import java.util.Arrays;

public class ArrayHashing {
    public static void main(String[] args) {
        int[] input = { 1, 0, 3, 5, 2, 1, 4, 8, 5, 6, 9, 12, 11, 10, 6 };
        int[] hashArray = new int[13];
        for (int i = 0; i < input.length; i++) {
            hashArray[input[i]]++;
        }
        System.out.println(Arrays.toString(hashArray));
        System.out.println("No of times 5 apprears in input array is " + hashArray[5]);
        System.out.println("No of times 0 apprears in input array is " + hashArray[0]);
    }
}
