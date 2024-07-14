package design_pattern.strctural.adopter_dp;

public class GroceryToItemsAdopter implements Items {

    private GroceryItems groceryItems;

    public GroceryToItemsAdopter(GroceryItems groceryItems) {
        this.groceryItems = groceryItems;
    }

    @Override
    public String getItemName() {
        return groceryItems.getName();
    }

    @Override
    public String getPrice() {
        return groceryItems.getPrice();
    }

    @Override
    public String getRestaurant() {
        return groceryItems.getStore();
    }

    @Override
    public String toString() {
        return "GroceryToItemsAdopter{" +
                "groceryItems=" + groceryItems +
                '}';
    }
}
