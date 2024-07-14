package recursion;

import java.util.HashMap;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 50;
        // 0,1,1,2,3,5,8
        HashMap<Integer, Long> memory = new HashMap<>();
        int time = (int) System.currentTimeMillis();
        while (n >= 0) {
//            System.out.println(fibonacciWithMemory(n, memory));
            System.out.println(fibonacci(n));
            n--;
        }
        System.out.println("Time taken: "+(System.currentTimeMillis()-time/1000)%60);

    }

    private static long fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    private static long fibonacciWithMemory(int n, HashMap<Integer, Long> memory) {
        if(!memory.isEmpty() && memory.containsKey(n))
            return memory.get(n);

        if (n <= 1)
            return n;

        long f = fibonacciWithMemory(n-1, memory) + fibonacciWithMemory(n-2, memory);
        memory.put(n, f);
        return f;
    }
}
