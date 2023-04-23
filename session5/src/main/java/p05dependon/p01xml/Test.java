package p05dependon.p01xml;

import org.springframework.context.support.GenericXmlApplicationContext;
import p02autowiring.Target;

public class Test {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("file:F:\\SpringJava\\session5\\src\\main\\java\\p05dependon\\p01xml\\config.xml");
        context.refresh();

        final BeanOne bean = context.getBean(BeanOne.class);


    }
}
