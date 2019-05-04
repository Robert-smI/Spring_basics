package project.pizzaType;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import project.IPizza;

@Getter
@Setter
@Component
@Qualifier("good")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // set scope: prototype  for instance object pizza
// @PropertySource("classpath: properties/price" )
public class GoodPizza implements IPizza {

    private int price;
    private String name;

//"${price_good}"
    public GoodPizza(@Value("99") int price,@Value("Goodfather") String name) {
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
