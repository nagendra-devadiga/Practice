package multithreading.printsequence;

public class PrintLetterAndNumber {
    private boolean printFlag = true;
    private void printNumber() {
        for (int i = 1; i <= 26; i++) {
            synchronized (this) {
                if(printFlag){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.print(" "+ i);
                printFlag = true;
                notify();

            }
        }
    }

    private void printLetter() {
        for (int i = 'A'; i <= 'Z'; i++) {
            synchronized (this) {
                if(!printFlag){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.print(" "+ (char) i);
                printFlag = false;
                notify();

            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        PrintLetterAndNumber ps = new PrintLetterAndNumber();
        Thread t1 = new Thread(ps::printNumber, "ThreadOne");
        Thread t2 = new Thread(ps::printLetter, "ThreadTwo");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}

