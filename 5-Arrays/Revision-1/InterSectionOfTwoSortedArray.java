import java.util.ArrayList;

public class InterSectionOfTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = { 1, 1, 2, 3, 4, 4, 5 };
        int[] arr2 = { 2, 3, 4, 4, 5, 5, 5, 6 };
        int sizeOne = arr1.length;
        int sizeTwo = arr2.length;
        int i = 0;
        int j = 0;
        ArrayList<Integer> Result = new ArrayList<>();
        while (i < sizeOne && j < sizeTwo) {
            while (i < sizeOne - 1 && arr1[i] == arr1[i + 1])
                i++;
            while (j < sizeTwo - 1 && arr2[j] == arr2[j + 1])
                j++;

            if (arr1[i] < arr2[j])
                i++;
            else if (arr1[i] > arr2[j])
                j++;
            else {
                Result.add(arr1[i]);
                i++;
                j++;
            }
        }
        System.out.println(Result);
    }
}
