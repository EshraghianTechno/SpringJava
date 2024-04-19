package p05dependon.p02annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
@ComponentScan(basePackages = {"p05dependon.p02annotation"})
public class Config {
    @Bean
    @DependsOn({"beanTwo", "beanThree"})
    public BeanOne beanOne() {
        return new BeanOne();
    }

    @Bean
    public BeanTwo beanTwo(){
        return new BeanTwo();
    }
    @Bean
    public BeanThree beanThree(){
        return new BeanThree();
    }
}
