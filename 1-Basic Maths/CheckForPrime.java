public class CheckForPrime {
    static boolean primeCheck(int num){
        int  count = 0;
        for(int i = 1; i*i<=num; i++){
            if(num%i==0){
                count++;
                if(num/i!=i){
                    count++;
                }
            }
        }
        return count==2;
    }
    public static void main(String[] args) {
        int num = 7;
        // O(sqrt(num))
        System.out.println(primeCheck(num));
    }
}
