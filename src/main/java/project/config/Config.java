package project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import project.pizzaType.Exotic;
import project.IOrder;
import project.IPizza;
import project.Order;

@Configuration
public class Config {

    @Bean
    public IPizza createPizza (){
        return new Exotic(59, "Hawaii");
    }
    @Bean(name = "otherOrder")
    public IOrder createOrder (IPizza pizza){
        return new Order(pizza);
    }
}
