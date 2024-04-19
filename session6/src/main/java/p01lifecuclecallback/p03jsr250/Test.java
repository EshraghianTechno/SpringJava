package p01lifecuclecallback.p03jsr250;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        System.out.println("before close context");
        context.close();
        System.out.println("after close context");
    }
}
