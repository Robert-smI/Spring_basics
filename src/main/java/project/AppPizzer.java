package project;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import project.config.Config;

public class AppPizzer {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext configcontext = new AnnotationConfigApplicationContext(Config.class);

        IOrder order = configcontext.getBean(IOrder.class);
        // second method
        IOrder order1 = (IOrder) configcontext.getBean("otherOrder");  // or name = "createOrder" - not name definition in project.config.Config


        order.printOrder();

    }


}
