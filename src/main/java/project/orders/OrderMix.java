package project.orders;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import project.IOrder;
import project.IPizza;

import java.util.*;

@Component
public class OrderMix implements IOrder {

    // SpEL    Value = ID or class name low-case
    @Value("#{vegetarian}")
    private  IPizza pizza;


    public OrderMix() {
        this.pizza = pizza;
    }


    @Override
    public void printOrder() {
        System.out.println( "Order mix: "+"\""+ pizza.getName() +"\""+ ", price: " + pizza.getPrice() );
    }





}
