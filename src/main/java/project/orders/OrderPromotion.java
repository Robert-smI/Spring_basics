package project.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import project.IOrder;
import project.IPizza;

@Component
public class OrderPromotion implements IOrder {


    @Autowired
    @Qualifier("exo")
    private IPizza pizza;


    @Override
    public void printOrder() {
        System.out.println("Order promotion: "+"\""+pizza.getName()+"\"" + ", price: " + pizza.getPrice());
    }

    public IPizza getPizzza() {
        return pizza;
    }


    public void setPizzza(IPizza pizzza) {
        this.pizza = pizzza;
    }

}
