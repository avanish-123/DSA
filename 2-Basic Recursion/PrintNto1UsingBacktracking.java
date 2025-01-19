public class PrintNto1UsingBacktracking {
    static void print(int n1, int n2){
        if(n2>n1) return;
        print(n1, n2+1);
        System.out.print(n2 + " ");

    }
    public static void main(String[] args) {
        int n = 14;
        print(n, 1);
    }
}
