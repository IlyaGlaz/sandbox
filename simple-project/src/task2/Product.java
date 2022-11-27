package task2;

public class Product {

    private final int portionSize;
    private final int portions;
    private final int fat;
    private final int sodium;
    private final int protein;

    public static class Builder {
        private final int portionSize;
        private final int portions;
        private int fat = 0;
        private int sodium = 0;
        private int protein = 0;

        public Builder(int portionSize, int portions) {
            this.portionSize = portionSize;
            this.portions = portions;
        }

        public Builder fat(int val) {
            fat = val;
            return this;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }

        public Builder protein(int val) {
            protein = val;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }

    private Product(Builder builder) {
        portionSize = builder.portionSize;
        portions = builder.portions;
        fat = builder.fat;
        sodium = builder.sodium;
        protein = builder.protein;
    }

    @Override
    public String toString() {
        return "tank2.Product{" +
                "portionSize=" + portionSize +
                ", portions=" + portions +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", protein=" + protein +
                '}';
    }
}
