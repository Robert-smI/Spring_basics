package project.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import project.IOrder;
import project.IPizza;

@Component
@Primary

public class OrderExclusive implements IOrder {


    private IPizza pizza;

    public OrderExclusive() {
        super();
    }


    @Override
    public void printOrder() {
        System.out.println("Order exclusive: "+"\""+pizza.getName()+"\"" + ", price: " + pizza.getPrice());
    }

    public IPizza getPizzza() {
        return pizza;
    }


    @Autowired
    @Qualifier("good")
    public void setPizzza(IPizza pizzza) {
        this.pizza = pizzza;
        pizza.setPrice(111);
    }
}
