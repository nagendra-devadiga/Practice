package multithreading.syncronizedblock;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {
        Stack stack = new Stack(10);

        Thread t1 = new Thread(() -> {
            int counter = 1;
            while (++counter <= 5) {
                stack.push(counter*10);
            }
        }, "ThreadOne");
        Thread t2 = new Thread(() -> {
            int counter = 0;
            while (++counter <= 5) {
                 stack.pop();
            }
        }, "ThreadTwo");

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        Thread.sleep(5555);
        stack.display();
    }
}
