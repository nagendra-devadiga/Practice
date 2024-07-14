public class IsFibonacci {
    public static void main(String[] args) {
        int item = 200;
        int fib=0;
        int t1 = 0;
        int t2 = 1;

        while(true) {
            fib = t1 + t2;
            if(fib >= item) break;
            t1 = t2;
            t2 = fib;
        }

        System.out.println("is fibonacci -> " + (fib == item));

    }
}
