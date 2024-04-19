package p01lifecuclecallback.p05applicationContextAware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        // context.close();
        //or
//           context.registerShutdownHook();
    }
}
