package singletone;

public class SingletonNormal {
    private static SingletonNormal INSTANCE = null;
    private SingletonNormal() {

    }

    public static SingletonNormal getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonNormal();
        }
        return INSTANCE;
    }
}