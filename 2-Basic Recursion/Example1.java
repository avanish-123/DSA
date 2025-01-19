class Example1 {
    static void print(int n) {
        if (n > 10)
            return;
        System.err.print(n + " ");
        print(n + 1);
    }

    public static void main(String[] args) {
        int num = 1;
        print(num); 

    }
}
