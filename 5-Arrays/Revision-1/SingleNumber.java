
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SingleNumber {
    public static void main(String[] args) {
        // its a better method but not optimal
        // for optimal visite leetcode SingleNumber question
        int[] arr = { 2, 3, 4, 3, 2, 1, 1 };
        Set<Integer> setArr = new TreeSet<>();
        int arraySum = 0;
        int setSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arraySum += arr[i];
            setArr.add(arr[i]);
        }
        Iterator<Integer> setVal = setArr.iterator();
        while (setVal.hasNext()) {
            setSum += setVal.next();
        }
        System.out.println(setArr);
        System.out.println(2 * setSum - arraySum);
    }
}
