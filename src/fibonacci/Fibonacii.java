package fibonacci;

public class Fibonacii {
    public static void main(String[] args) {
        int n = 10;
        int t1 = 0;
        int t2 = 1;
        while(n >= 0) {
            int fibo = t1 + t2;
            t1 = t2;
            t2 = fibo;
            System.out.println(fibo);
            n--;
        }
    }
}
