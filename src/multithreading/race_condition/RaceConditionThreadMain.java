package multithreading.race_condition;

public class RaceConditionThreadMain {
    public static void main(String[] args) throws InterruptedException {
        RaceConditionThread rc = new RaceConditionThread();
        Thread t1 = new Thread(rc, "T1");
        Thread t2 = new Thread(rc, "T2");

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(rc.getCount());
    }
}
