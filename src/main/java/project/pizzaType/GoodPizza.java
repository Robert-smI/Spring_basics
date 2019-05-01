package project.pizzaType;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import project.IPizza;

@Getter
@Component
public class GoodPizza implements IPizza {

    private int price;
    private String name;


    public GoodPizza(@Value("999") int price,@Value("Goodfather") String name) {
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
