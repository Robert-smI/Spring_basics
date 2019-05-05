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

    //SpEL: check price format
    @Value("#{exotic.price matches '[0-9][0-9]'}")
    boolean isDoubleDigits;

    //SpEL: set price from class GoodPizza value:
    public Exotic(@Value("#{goodPizza.price < 50 ? 50: goodPizza.getPrice()}") int price, @Value("Hawaii") String name) {
        this.price = price;
        this.name = name;
    }



    public int getPrice() {
      //  System.out.print("is double digits: "+isDoubleDigits+" ");
        return price;
    }

    public String getName() {
        return name;
    }
}
