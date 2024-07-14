package multithreading.race_condition.solution.synchronized_block;

public class UsingSynchronizedBlock implements Runnable {

    /**
     * Allows single thread to access shared resource at a time
     * Forces all other threads to wait for current thread to release resource.
     */

    private int count=0;

    @Override
    public void run() {
        synchronized (this) { // this means current object can have the lock since we will be passing same object while creating thread.
            for (int i = 0; i < 5; i++) { // each thread calls 5 times and increments by 5, so count will be (5 * number_of_threads)
                try {
                    Thread.sleep(10); // Add sleep condition to achieve Race condition
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                count++;
            }
        }

    }

    public int getCount() {
        return count;
    }
}
