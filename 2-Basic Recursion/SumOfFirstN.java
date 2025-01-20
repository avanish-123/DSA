public class SumOfFirstN {
    // parameterised recursion
    static void sumOfN(int num, int sum){
        if(num==0){
            System.out.println(sum);
            return;
        }
        sumOfN(num-1, sum+num);
    }

    // functional recursion
    static int sumOfN2(int num){
        if(num==0) return 0;
        return num + sumOfN2(num-1);

    }

    public static void main(String[] args){
        int num = 15;
        sumOfN(num, 0);
        System.out.println(sumOfN2(num));

    }
}
