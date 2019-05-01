package project.pizzaType;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import project.IPizza;

//@Component
public class Exotic implements IPizza {

    private int price;
    private String name;

    public Exotic(@Value("59") int price, @Value("Hawaii") String name) {
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
