public class GCD {
    static int min(int n1, int n2){
        if(n1>=n2){
            return n2;
        }
        return n1;
    }
    static int checkGCD(int n1, int n2){
        int min = min(n1, n2);
        int gcd = 0;
        for(int i = 1; i<=min; i++){
            if(n1%i==0 && n2%i==0 && i>gcd){
                gcd = i;
            }
        }
        return gcd;
        
    }
    public static void main(String[] args) {
        int num1 = 11;
        int num2 = 13;
        System.out.println(checkGCD(num1, num2));
        
    }
}
