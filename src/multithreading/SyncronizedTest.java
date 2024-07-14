package multithreading;

public class SyncronizedTest {
    int count = 0;
    public synchronized void countIt() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            count++;
            Thread.sleep(i*10);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SyncronizedTest obj = new SyncronizedTest();
        Thread t1 = new Thread(
                () -> {
                    try {
                        obj.countIt();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
        );
        Thread t2 = new Thread(
                () -> {
                    try {
                        obj.countIt();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
        );

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(obj.count);
    }
}
