import java.util.ArrayList;

class UnionOfTwoSoredArray {
    public static void main(String[] args) {
        int[] arr1 = { 1, 1, 2, 3, 4, 4, 5 };
        int[] arr2 = { 2, 3, 4, 4, 5, 5, 5, 6 };
        int sizeOne = arr1.length;
        int sizeTwo = arr2.length;
        int i = 0;
        int j = 0;
        ArrayList<Integer> Result = new ArrayList<>();
        while (i < sizeOne && j < sizeTwo) {
            if ((arr1[i] < arr2[j])) {
                if (Result.isEmpty() || Result.getLast() != arr1[i]) {
                    Result.add(arr1[i]);

                }
                i++;
            } else if ((arr1[i] > arr2[j])) {
                if ((Result.isEmpty() || Result.getLast() != arr2[j])) {
                    Result.add(arr2[j]);
                }
                j++;
            } else if (arr1[i] == arr2[j]) {
                i++;
            }

        }
        while(i<sizeOne){
            if(Result.isEmpty() || Result.getLast()!=arr1[i]){
                Result.add(arr1[i]);
            }
            i++;
        }
        while(j<sizeTwo){
            if(Result.isEmpty() || Result.getLast()!=arr2[j]){
                Result.add(arr2[j]);
            }
            j++;
        }
        System.out.println(Result);
    }
}