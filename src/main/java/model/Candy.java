package model;



public class Candy extends Product {


    public Candy(int id, double price, String snack) {
        super(id, price, snack);
    }

    @Override
    public String examine() {
        return "{ id: " + getId() + ", snack: " + getProductName() + " }";
    }

    @Override
    public String use() {
        return "You eat some " + getProductName();
    }

}
