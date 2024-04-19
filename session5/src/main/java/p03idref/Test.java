package p03idref;

import org.springframework.context.support.GenericXmlApplicationContext;
import p02autowiring.Target;

public class Test {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("file:F:\\SpringJava\\session5\\src\\main\\java\\p03idref\\config.xml");
        context.refresh();

        final BeanOne one = context.getBean("one", BeanOne.class);
        System.out.println(one.getName());
    }
}
