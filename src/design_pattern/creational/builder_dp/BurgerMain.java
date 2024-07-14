package design_pattern.creational.builder_dp;

public class BurgerMain {
    public static void main(String[] args) {
        Burger burger = new Burger.BurgerBuilder()
                                .egg(true).onion(true).builder();

        System.out.println(burger);
    }
}
