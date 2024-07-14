package design_pattern.creational.abstract_dp;

public class AppMain {
    public static void main(String[] args) {
        App a = new App(new Mac());
        a.print();
    }
}
