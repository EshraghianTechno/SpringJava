package ir.dotin.beandefinition.annotationclassconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "ir.dotin.beandefinition.annotationclassconfig")
public class Config {
    @Bean
    public MyRepository repository() {
        /// we can do every thing with our object
        return new MyRepository();
    }

    @Bean
    public MyService service() {
        /// we can do every thing with our object
        return new MyService();
    }
}
