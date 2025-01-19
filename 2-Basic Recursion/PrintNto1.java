// here we will apply different method from 1 to n
public class PrintNto1 {
    static void print(int n1, int n2){
        if(n1<n2) return;
        System.err.print(n1 + " ");
        print(n1-1, n2);

    }
    public static void main(String[] args) {
        int n = 14;
        print(n,1);
    }
}
