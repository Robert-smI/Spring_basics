package project.autoConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("project.pizzaType, project.orders")
public class AutoConfig {

}
