
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        // bruteForce using set data structure
        int[] arr1 = { 1, 2, 2, 4, 5 };
        int[] arr2 = { 1, 2, 3 };
        int size1 = arr1.length;
        int size2 = arr2.length;
        // imp to use tree set to maintain the order
        Set<Integer> temp = new TreeSet<>();
        for (int i = 0; i < size1; i++) {
            temp.add(arr1[i]);
        }
        for (int j = 0; j < size2; j++) {
            temp.add(arr2[j]);
        }
        System.out.println(temp);

        // optimal
        int i = 0;
        int j = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while (i < size1 && j < size2) {
            if (arr1[i] < arr2[j]) {
                if (ans.isEmpty() || ans.getLast() != arr1[i]) {
                    ans.add(arr1[i]);
                }
                i++;

            } else {
                if (ans.isEmpty() || ans.getLast() != arr2[j]) {
                    ans.add(arr2[j]);
                }
                j++;
            }
        }
        while (i < size1) {
            if (ans.isEmpty() || ans.getLast() != arr1[i]) {
                ans.add(arr1[i]);
            }
            i++;
        }
        while (j < size2) {
            if (ans.isEmpty() || ans.getLast() != arr2[j]) {
                ans.add(arr2[j]);
            }
            j++;
        }

        System.out.println(ans);

    }
}
