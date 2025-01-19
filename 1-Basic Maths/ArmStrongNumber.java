public class ArmStrongNumber {
    static boolean checkArmStrong(int num) {
        int temp = num;
        int newNum = 0;
        while (num != 0) {
            int rem = num % 10;
            newNum = newNum + (rem * rem * rem);
            num /= 10;
        }
        return temp == newNum;
    }

    public static void main(String[] args) {
        int num = 1634;
        System.out.println(checkArmStrong(num));
    }

}
