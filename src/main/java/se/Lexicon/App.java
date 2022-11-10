package se.Lexicon;


import model.*;

public class App {
    public static void main(String[] args) {
        Product[] products = {

                new Candy(1, 200, " candyBar"),
                new Candy(2, 10, "snicker"),
                new Drink(3, 15, "coke","large",200),
                new Drink(4, 25, "coffee","medium",33),
                new PotatisChips(5, 5, "Potato_chips"),
                new PotatisChips(6, 13, "Onion_chips"),
        };
        VendingMachine order = new VendingMachineImpl(products);

        for (String string : order.getProducts()) {
            System.out.println(string);
            System.out.println("-----");
        }


        order.addCurrency(50);
        Product Drink = order.request(4);
        System.out.println(Drink.use());
        System.out.println(order.getBalance());
    }

}
