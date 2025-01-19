import java.util.Scanner;

public class CountDigits {
    static int count(int num) {
        int count = 0;
        while(num>0){
            count++;
            num = num/10;
        }

        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(count(n));
        sc.close();
    }
}
