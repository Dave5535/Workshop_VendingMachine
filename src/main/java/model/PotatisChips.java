package model;

public class PotatisChips extends Product {

        public PotatisChips(int id, double price, String snack) {
            super(id, price, snack);
        }

        @Override
        public String examine() {
            return "{ id: " + getId() + ", fruit: "  + getProductName() + " }";
        }

        @Override
        public String use() {
            return "{ id: " + getId() + ", fruit: "  + getProductName() + " }";
        }
    }

