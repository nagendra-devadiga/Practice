package multithreading.printsequence.printer;

public class PrinterMain {

    public static void main(String[] args) throws InterruptedException {
        Printer evenPrint = new Printer(0);
        Printer oddPrint = new Printer(1);

        Thread evenThread = new Thread(evenPrint, "EvenThread");
        Thread oddThread = new Thread(oddPrint, "OddThread");

        evenThread.start();
        oddThread.start();
    }

}
