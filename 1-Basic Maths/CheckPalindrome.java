public class CheckPalindrome {
    static boolean  check(int num){
        int temp = num;
        int newNum = 0;
        while(num>0){
            newNum = newNum*10 + num%10;
            num/=10;
        }
        return temp==newNum;
    }
    public static void main(String[] args) {
        int num = 1234321;
        System.out.println(check(num));

    }
}
