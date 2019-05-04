package project;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import project.autoConfig.AutoConfig;
import project.orders.Order;
import project.orders.OrderPromotion;

public class AppPizzer {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext configcontext = new AnnotationConfigApplicationContext(AutoConfig.class);

        // select Pizza with: @Autowired  @Qualifier("good") over setter
        IOrder order = configcontext.getBean(IOrder.class);

        // select Pizza with:  @Qualifier("good") in constructor Order class
        IOrder order1 = configcontext.getBean(Order.class);

        // select Pizza with:  @Qualifier("exo") over firld "pizza" in OrderPromotion class / reflexion
        IOrder order2 = configcontext.getBean(OrderPromotion.class);

        order.printOrder();
        order1.printOrder();
        order2.printOrder();



    }


}
