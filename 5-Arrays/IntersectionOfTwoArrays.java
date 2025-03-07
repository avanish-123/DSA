
import java.util.ArrayList;
import java.util.List;

// sorted arrays
public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 3, 4, 5, 6, 7 };
        int[] arr2 = { 3, 3, 4, 4, 5, 8 };
        int sizeOne = arr1.length;
        int sizeTwo = arr2.length;
        int i = 0;
        int j = 0;
        List<Integer> temp = new ArrayList<>();
        while (i < sizeOne && j < sizeTwo) {
            if (arr1[i] != arr2[j]) {
                if (arr1[i] < arr2[j]) {
                    i++;
                } else {
                    j++;
                }
            } else {
                // for unique
                // if (temp.isEmpty() || temp.getLast() != arr1[i]) {
                // temp.add(arr1[i]);
                // }
                // for non unique result
                temp.add(arr1[i]);
                i++;
                j++;

            }
        }
        System.out.println(temp);
    }
}
