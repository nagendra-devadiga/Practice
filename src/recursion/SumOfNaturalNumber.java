package recursion;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        int n = 5;
        int sum = sumOf(n);
        System.out.println(sum);
    }

    private static int sumOf(int n) {
        return (n == 0) ? 0 : n + sumOf(n-1);
    }
}
