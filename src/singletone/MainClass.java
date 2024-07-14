package singletone;

public class MainClass {
    public static void main(String[] args) {

        // ----------------
        SingletonNormal st1 = SingletonNormal.getINSTANCE();
        System.out.println(st1);
        SingletonNormal st2 = SingletonNormal.getINSTANCE();
        System.out.println(st2);
        System.out.println(st1 == st2);

        // ------------
        SingletonEnum singleton = SingletonEnum.INSTANCE;
        SingletonEnum singleton1 = SingletonEnum.INSTANCE;

        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
        System.out.println(singleton.equals(singleton1));

        // -------------
        Thread t1 = new Thread(() -> {
            DoubleCheck dc = DoubleCheck.getInstance();
            System.out.println(dc);
        });
        t1.start();

        Thread t2 = new Thread(() -> {
            DoubleCheck dc = DoubleCheck.getInstance();
            System.out.println(dc);
        });
        t2.start();
    }
}
