
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MergeSort {
    static void merge(int[] arr, int low, int mid, int high) {
        List<Integer> tempArr = new ArrayList<>();
        int leftArrStart = low;
        int rightArrStart = mid + 1;
        while (leftArrStart <= mid && rightArrStart <= high) {
            if (arr[leftArrStart] <= arr[rightArrStart]) {
                tempArr.add(arr[leftArrStart]);
                leftArrStart++;
            } else if (arr[leftArrStart] > arr[rightArrStart]) {
                tempArr.add(arr[rightArrStart]);
                rightArrStart++;
            }
        }
        while (leftArrStart <= mid) {
            tempArr.add(arr[leftArrStart]);
            leftArrStart++;
        }
        while (rightArrStart <= high) {
            tempArr.add(arr[rightArrStart]);
            rightArrStart++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = tempArr.get(i - low);
        }

    }

    static void mergeSort(int[] arr, int low, int high) {
        if (low >= high)
            return;
        int mid = (high + low) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 3, 2, 1, 2, 3, 4, 5, 88, 3, 2, 1, 1, 23, 3 };
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}