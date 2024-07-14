package multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest implements Runnable {
    AtomicInteger count = new AtomicInteger();
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(i*100);
                count.getAndIncrement();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        AtomicTest at = new AtomicTest();
        Thread t1 = new Thread(at);
        t1.start();
        Thread t2 = new Thread(at);
        t2.start();
        t2.join();

        System.out.println(at.count);
    }
}
