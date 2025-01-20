public class PrintName5Times {
    static void print(int n){
        if(n==0) return;
        System.out.println("Avanish");
        print(n-1);
    }
    public static void main(String[] args){
        int n = 5;
        print(n);
    }
}
