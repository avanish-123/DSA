import java.util.Scanner;

public class Print1toNLinearly {
    static void print(int n){
        if(n==0) return;
        print(n-1);
        //here we are applying backtracking
        System.out.print(n + " ");
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        print(num);
        sc.close();
    }
}
