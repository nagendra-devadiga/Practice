package multithreading.printsequence.printer;

import multithreading.printsequence.multiple_thread_print.PrintMultipleThreadAccess;

public class Printer implements Runnable {

    static int counter = 0;
    int reminder;
    final static Object lock = new Object(); // lock should same for multiple threads so make it static

    public Printer(int reminder) {
        this.reminder = reminder;
    }

    private static void print() {
        System.out.println(Thread.currentThread().getName()+": "+counter++);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (lock){
                while (counter % 2 != reminder) {
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
