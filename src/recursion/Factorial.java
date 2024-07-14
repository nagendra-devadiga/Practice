package recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int fact = fact(n);
        System.out.println(fact);
    }

    private static int fact(int n) {
        return (n <= 0) ? 1 : n*fact(n-1);
    }
}
