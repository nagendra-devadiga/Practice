package design_pattern.strctural.adopter_dp;

import java.util.ArrayList;
import java.util.Arrays;

public class Cart {

    private final ArrayList<Items> cartItem = new ArrayList<>();

    public Cart() {
    }

    public void addItems(Items item) {
        cartItem.add(item);
    }

    public void getItems() {
        System.out.println(Arrays.toString(cartItem.toArray()));
    }
}
