package multithreading.race_condition.solution.atomic_variable;

public class UsingAtomicMain {
    public static void main(String[] args) throws InterruptedException {
        UsingAtomic rc = new UsingAtomic();
        Thread t1 = new Thread(rc, "T1");
        Thread t2 = new Thread(rc, "T2");
        Thread t3 = new Thread(rc, "T#");

        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();

        System.out.println(rc.getCount());
    }
}