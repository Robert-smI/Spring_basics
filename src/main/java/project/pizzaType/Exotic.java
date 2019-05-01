package project.pizzaType;

import project.IPizza;

public class Exotic implements IPizza {

    private int price;
    private String name;

    public Exotic(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
