package p09customizingScanning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Object myBean = context.getBean("myBean");
        System.out.println(myBean);

    }
}
