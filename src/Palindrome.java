public class Palindrome {
    public static void main(String[] args) {
        int n = 10001;
        int a = n;
        int b = 0;
        while (a != 0) {
            int r = a % 10;
            b = (b * 10) + r;
            a = a/10;
        }
        System.out.println("is palindrome -> "+ (b == n));
    }
}
