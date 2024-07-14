package multithreading;

public class JoinFuncTest implements Runnable {
    public void printIt() throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            Thread.sleep(100);
            System.out.println("Thread " + Thread.currentThread().getName() + " printing " + i);
        }
    }
    @Override
    public void run() {
        try {
            printIt();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        JoinFuncTest jt = new JoinFuncTest();

        Thread t1 = new Thread(jt);

        Thread t2 = new Thread(jt);
        t2.start();
        t2.join(); // it executes first and halts even main thread

        t1.start();

        jt.printIt(); // main method executes it

    }
}
