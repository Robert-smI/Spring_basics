package project.autoConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import project.config.Config;

@Configuration
@ComponentScan("project.pizzaType, project.orders")
@Import(Config.class)  // added import to use Bean from Config
public class AutoConfig {

}
