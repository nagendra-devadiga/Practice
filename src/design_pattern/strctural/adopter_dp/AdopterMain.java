package design_pattern.strctural.adopter_dp;

public class AdopterMain {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.addItems(new FoodProduct("Fish Fry", "1000", "Karavali"));

        /**
         * convert to grocery to adopt
         */
        cart.addItems(new GroceryToItemsAdopter(new GroceryProduct("Onion", "10", "Vishal Mart")));

        cart.getItems();
    }
}
