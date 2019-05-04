package project.pizzaType;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import project.IPizza;

@Setter
@Component
@Qualifier("exo")
@Primary
public class Exotic implements IPizza {

    private int price;
    private String name;

    public Exotic(@Value("31") int price, @Value("Hawaii") String name) {
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
