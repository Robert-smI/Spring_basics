package project.orders;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import project.IOrder;
import project.IPizza;

@Component

public class Order implements IOrder {


    private static IPizza pizza;


    public Order(@Qualifier("good") IPizza pizza) {
        this.pizza = pizza;
    }

    public void printOrder() {
        System.out.println("Order: "+"\""+pizza.getName()+"\"" + ", price: " + pizza.getPrice());
    }
}
