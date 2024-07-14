package singletone;

import java.io.ObjectStreamException;
import java.io.Serial;
import java.io.Serializable;

public class DoubleCheck implements Serializable, Cloneable{
    private static volatile DoubleCheck INSTANCE = null;

    private DoubleCheck() {
        // Check if we already have an instance
        if (INSTANCE != null) {
            throw new IllegalStateException("Singleton" +
                    " instance already created.");
        }
    }
    // don't add synchronized keyword for method as it's a costly action, we don't require to have on every call, so added in if condition.
    public static DoubleCheck getInstance() {
        if (INSTANCE == null) {
            synchronized (DoubleCheck.class) {
                // Double-checked
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheck();
                }
            }
        }
        return INSTANCE;
    }

    @Serial
    public Object readResolve() {
        return INSTANCE;
    }

    @Serial
    private Object writeReplace() throws ObjectStreamException {
        return INSTANCE;
    }

    @Override
    public DoubleCheck clone() {
        return INSTANCE;
    }
}
