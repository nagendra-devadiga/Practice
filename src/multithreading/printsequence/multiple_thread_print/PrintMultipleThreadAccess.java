package multithreading.printsequence.multiple_thread_print;

public class PrintMultipleThreadAccess implements Runnable {

    static int counter = 0;
    int reminder;
    int numberOfThreadAccessing;
    static final Object lock = new Object();

    public PrintMultipleThreadAccess(int reminder, int numberOfThreadAccessing) {
        this.reminder = reminder;
        this.numberOfThreadAccessing = numberOfThreadAccessing;
    }

    private static void print() {
        System.out.println(Thread.currentThread().getName()+ " " + counter++);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (lock){
                while (counter % numberOfThreadAccessing != reminder) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                print();
                lock.notifyAll();
            }
        }
    }
}
