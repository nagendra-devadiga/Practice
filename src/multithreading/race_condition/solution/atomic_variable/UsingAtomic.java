package multithreading.race_condition.solution.atomic_variable;

import java.util.concurrent.atomic.AtomicInteger;

public class UsingAtomic implements Runnable {
    private final AtomicInteger count = new AtomicInteger();

    @Override
    public void run() {
            for (int i = 0; i < 5; i++) { // each thread calls 5 times and increments by 5, so count will be (5 * number_of_threads)
                try {
                    Thread.sleep(10); // Add sleep condition to achieve Race condition
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                count.getAndIncrement();
            }
    }

    public int getCount() {
        return count.intValue();
    }
}
