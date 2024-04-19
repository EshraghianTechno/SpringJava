package p05dependon.p02annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
//        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
//        context.load("file:F:\\SpringJava\\session5\\src\\main\\java\\p05dependon\\p01xml\\config.xml");
//        context.refresh();
//        BeanOne beanOne = context.getBean(BeanOne.class);


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        BeanOne beanOne = context.getBean(BeanOne.class);


    }
}
