public class CheckIfArrayIsSorted {
    static boolean check(int[] arr){
        for(int i = 1; i<arr.length; i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(check(arr));
        

    }
}
