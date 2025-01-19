public class ReverseNumber {
    static int reverse(int n){
        int newNum = 0;
        while(n!=0){
            int rem = n%10;
            newNum = newNum*10 + rem;
            n/=10;
        }
        return newNum;
    }
    public static void main(String[] args){
        int n = 100000;
        System.out.println(reverse(n));
    }
}
