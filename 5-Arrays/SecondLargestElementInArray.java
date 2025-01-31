public class SecondLargestElementInArray {
    static int secondlargetsInt(int arr[]){
        int largest = 0;
        int secondLargest = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
            if(arr[i]<largest && arr[i]>secondLargest){
                secondLargest = arr[i];

            }
        }
        return secondLargest;

    } 
    public static void main(String[] args){
        int[] arr = {1,2,4,5,6,4,3,2,1,3,5,6,8,5,43322,3,4,54};
        System.out.println(secondlargetsInt(arr));
    }
}
