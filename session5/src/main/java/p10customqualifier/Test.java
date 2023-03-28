package p10customqualifier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        final MyService service = context.getBean(MyService.class);
        service.getDao().create();
    }
}
