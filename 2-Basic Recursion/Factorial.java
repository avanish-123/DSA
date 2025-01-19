public class Factorial {
    //functional
    static int factorial(int n){
        if(n==1) return 1;
        return n * factorial(n-1);
    }

    //parameterised
    static void factorial(int num, int res){
        if(num==1){
            System.out.println(res);
            return;
        }
        factorial(num-1, res*num);
    }
    public static void main(String[] args) {
        int num = 5;
        System.out.println(factorial(num));
        factorial(num, 1);
    }
}
