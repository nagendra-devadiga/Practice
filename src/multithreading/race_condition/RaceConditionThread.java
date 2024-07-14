package multithreading.race_condition;

public class RaceConditionThread implements Runnable {

    /**
     * When 2 or more threads are try to manipulate the mutually shared resource/data at the same time.
     * Mutually shared data here is "count".
     * Added sleep to achieve Race Condition to demonstrate
     */
    private int count=0;

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(10); // Add sleep condition to achieve Race condition
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}
