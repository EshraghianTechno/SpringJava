package ir.dotin.beandefinition.programmatically;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        MyService myService = new MyService();
        context.registerBean("service", MyService.class, () -> myService);
        context.registerBean("service1",
                MyService.class,
                () -> myService,
                (BeanDefinition beanDefinition) -> beanDefinition.setPrimary(true));

        MyService s = context.getBean(MyService.class);
        System.out.println(s);
    }
}
