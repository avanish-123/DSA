public class PrintAllDivisor {
    public static void main(String[] args) {
        int num = 36;
        // brureforce method
        for(int i = 1; i<=num; i++){
            if(num%i==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        // optimal approach
        for(int i = 1; i<=Math.sqrt(num); i++){
            if((num%i==0)){
                System.out.print(i + " ");
                if ((num/i!=i)) {
                    System.out.print(num/i + " ");
                    
                }
            }
        }
    }
}
