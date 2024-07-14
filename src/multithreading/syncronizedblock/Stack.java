package multithreading.syncronizedblock;

public class Stack {
    private int[] array;
    private volatile int stackTop;

    Stack(int capacity) {
        array = new int[capacity];
        stackTop = -1;
    }

    public synchronized void push(int item) {
        // if we don't add in method , as same object lock will be for multiple threads
        //        synchronized (this) {
        //
        //        }

        if(isFull()) {
            System.err.println("Stack is full");
            return;
        }
        ++stackTop;
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Current thread: "+ Thread.currentThread().getName()+ " pushing item "+ item + " at "+ stackTop);
        array[stackTop] = item;
        display();
    }

    public synchronized int pop() {
        if (isEmpty()) {
            System.err.println(" Stack is empty ");
            return Integer.MIN_VALUE;
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        int obj = array[stackTop];

        int[] anotherArray = new int[array.length];
        for (int i = 0, k = 0; i < array.length; i++) {
            if (i == stackTop) {
                continue;
            }
            anotherArray[k++] = array[i];
        }

        System.out.println("Current thread: "+ Thread.currentThread().getName()+ " popping "+ obj +" at "+ stackTop);
        array = anotherArray;
        stackTop--;
        display();
        return obj;
    }

    private boolean isEmpty() {
        return stackTop == -1;
    }

    private  boolean isFull() {
        return stackTop == array.length - 1;
    }

    public void display() {
        for(int a: array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
