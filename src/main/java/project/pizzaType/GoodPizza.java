package project.pizzaType;

import lombok.Getter;
import project.IPizza;

@Getter
public class GoodPizza implements IPizza {

    private int price;
    private String name;


    public GoodPizza(int price, String name) {
        super();
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
