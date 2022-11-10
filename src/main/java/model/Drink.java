package model;

public class Drink extends Product {
private final String size;
private final int cl;

public Drink(int id, double price, String snack, String size, int cl) {
        super(id, price, snack);
        this.size = size;
        this.cl = cl;
        }

@Override
public String examine() {
        return "{ id: " + getId() + ", snack: " + getProductName() + " }";
        }

@Override
public String use() {
        return "You Drink some " + getProductName();
        }

        }
