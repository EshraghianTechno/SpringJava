package ir.dotin.beandefinition.annotationclassconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        MyService myService = context.getBean(MyService.class);
        System.out.println(myService.getMyRepository());
    }
}
