package project;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import project.autoConfig.AutoConfig;
import project.orders.Order;
import project.orders.OrderMix;
import project.orders.OrderPromotion;

public class AppPizzer {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext configcontext = new AnnotationConfigApplicationContext(AutoConfig.class);

        // select Pizza with: @Autowired  @Qualifier("good") over setter
        IOrder order = configcontext.getBean(IOrder.class);

        // select Pizza with:  @Qualifier("good") in constructor Order class
        IOrder order1 = configcontext.getBean(Order.class);

        // select Pizza with:  @Qualifier("exo") over field "pizza" in OrderPromotion class / reflexion
        IOrder order2 = configcontext.getBean(OrderPromotion.class);

        // SpEL : select Pizza with:  @Value ("#{vegetarian}") over field "pizza" in OrderMix class / reflexion
        // SpEL: Exotic - get price from class GoodPizza @Value("#{goodPizza.getPrice()}")
        // SpEL: Exotic - set price:  @Value("#{goodPizza.price < 50 ? 50: goodPizza.getPrice()}")
        IOrder order3 = configcontext.getBean(OrderMix.class);

        order.printOrder();
        order1.printOrder();
        order2.printOrder();
        order3.printOrder();

    }


}
