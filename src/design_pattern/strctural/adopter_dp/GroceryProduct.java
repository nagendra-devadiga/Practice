package design_pattern.strctural.adopter_dp;

public class GroceryProduct implements GroceryItems{

    private String name;
    private String price;
    private String store;

    public GroceryProduct(String name, String price, String store) {
        this.name = name;
        this.price = price;
        this.store = store;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getPrice() {
        return this.price;
    }

    @Override
    public String getStore() {
        return this.store;
    }

    @Override
    public String toString() {
        return "GroceryProduct{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", store='" + store + '\'' +
                '}';
    }
}
