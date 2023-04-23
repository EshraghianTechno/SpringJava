package ir.dotin.wiring.constructor.classconfig;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(config.class);
        MyService myService = context.getBean(MyService.class);
        myService.getRepository().create();

    }
}
