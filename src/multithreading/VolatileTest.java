package multithreading;

/**
 * Its also called cache coherence problem
 * Volatile variable visibility for all other threads which ever access to it.
 */
public class VolatileTest implements Runnable {
    // if non-volatile then it won't stop
    public volatile boolean flag = false;
    int count = 0;

    @Override
    public void run() {
        while (!flag) {
            count++;
        }
        System.out.println("Completed thread"+ Thread.currentThread().getName() + " with count " +count);
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileTest vt = new VolatileTest();
        Thread t1 = new Thread(vt);
        t1.start();

        Thread.sleep(100);
        vt.flag = true;

        vt.flag = false;

        Thread t2 = new Thread(vt);
        t2.start();
        Thread.sleep(100);
        vt.flag = true;

        System.out.println("Final count "+ vt.count);
    }
}
