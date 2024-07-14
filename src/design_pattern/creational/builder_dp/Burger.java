package design_pattern.creational.builder_dp;

public class Burger {
    private boolean egg;

    private String size;

    private boolean extraCheese;

    private boolean onion;

    private Burger(BurgerBuilder burgerBuilder) {
        this.egg = burgerBuilder.egg;
        this.onion = burgerBuilder.onion;
        this.extraCheese = burgerBuilder.extraCheese;
        this.size = burgerBuilder.size;
    }

    public boolean isEgg() {
        return egg;
    }

    public String getSize() {
        return size;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public boolean isOnion() {
        return onion;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "egg=" + egg +
                ", size='" + size + '\'' +
                ", extraCheese=" + extraCheese +
                ", onion=" + onion +
                '}';
    }

    public static class BurgerBuilder {
        private boolean egg;

        private String size;

        private boolean extraCheese;

        private boolean onion;

        public BurgerBuilder egg(boolean egg) {
            this.egg = egg;
            return this;
        }

        public BurgerBuilder size(String size) {
            this.size = size;
            return this;
        }

        public BurgerBuilder extraCheese(boolean extraCheese) {
            this.extraCheese = extraCheese;
            return this;
        }

        public BurgerBuilder onion(boolean onion) {
            this.onion = onion;
            return this;
        }

        public Burger builder() {
            return new Burger(this);
        }
    }
}
