package design_pattern.strctural.adopter_dp;

public class FoodProduct implements Items {
    private String name;
    private String price;
    private String restaurant;

    public FoodProduct(String name, String price, String restaurant) {
        this.name = name;
        this.price = price;
        this.restaurant = restaurant;
    }

    @Override
    public String getItemName() {
        return this.name;
    }

    @Override
    public String getPrice() {
        return this.price;
    }

    @Override
    public String getRestaurant() {
        return this.restaurant;
    }

    @Override
    public String toString() {
        return "FoodProduct{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", restaurant='" + restaurant + '\'' +
                '}';
    }
}
