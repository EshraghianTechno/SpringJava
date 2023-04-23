package p01EnvironmentAbstraction.p1profiles.p2annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
//@Profile("production")
@Profile("test")
public class Config2 {


    @Bean
//    @Profile("test")
    public BeanThree beanThree() {
        System.out.println("BeanThree In Config 2");
        return new BeanThree();
    }
}
