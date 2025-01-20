
import java.util.Arrays;
import java.util.Scanner;

public class Charhashing {
    public static void main(String[] args) {
        String st = "avanishchandrapandey";
        int[] hashArray = new int[26];
        for (int i = 0; i < st.length(); i++) {
            hashArray[st.charAt(i) - 97]++;
        }
        System.out.println(Arrays.toString(hashArray));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of search ");
        int noOfSearch = sc.nextInt();
        while (noOfSearch-- > 0) {
            System.out.print("Enter char that you want to serahc ocurence of ");
            char ch = sc.next().charAt(0);
            System.out.println("The occurence of" + ch + " is" + hashArray[ch - 97]);
        }
        sc.close();

    }
}
