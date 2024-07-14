package multithreading.printsequence.multiple_thread_print;

public class PrintMultipleThreadAccessMain {
    public static void main(String[] args) {
        PrintMultipleThreadAccess p1 = new PrintMultipleThreadAccess(0, 3);
        Thread t1 = new Thread(p1, "T1");

        PrintMultipleThreadAccess p2 = new PrintMultipleThreadAccess(1, 3);
        Thread t2 = new Thread(p2, "T2");

        PrintMultipleThreadAccess p3 = new PrintMultipleThreadAccess(2, 3);
        Thread t3 = new Thread(p3, "T3");

        t1.start();
        t2.start();
        t3.start();
    }
}
