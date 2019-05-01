package project;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import project.autoConfig.AutoConfig;

public class AppPizzer {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext configcontext = new AnnotationConfigApplicationContext(AutoConfig.class);

        IOrder order = configcontext.getBean(IOrder.class);


        order.printOrder();

    }


}
