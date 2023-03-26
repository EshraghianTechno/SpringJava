package ir.dotin.wiring.constructor.abstraction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        MyService s = context.getBean(MyService.class);
        s.getRepository().create();
    }
}
