package project.pizzaType;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import project.IPizza;

@Component
public class Vegetarian implements IPizza {

    private int price;
    private String name;

    //"${price_good}"
    public Vegetarian (@Value("33") int price, @Value("vegan") String name) {
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

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

}
