
import java.util.Arrays;

public class RearrangeArrayElementBySign {
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};  
        // bruteforce
        int []result = new int[arr.length];
        int positiveElementIndex = 0;
        int negativePointerIndex = 1;
        for(int ele: arr){
            if(ele>=0){
                result[positiveElementIndex] = ele;
                positiveElementIndex+=2;
            }else {
                result[negativePointerIndex] = ele;
                negativePointerIndex+=2;

            }
        }
        System.out.println(Arrays.toString(result));        
    }
}
