package p04FactoryBean.p01xml;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        GenericXmlApplicationContext context=new GenericXmlApplicationContext();
        context.load("file:F:\\SpringJava\\session6\\src\\main\\java\\p04FactoryBean\\p01xml\\config.xml");
        context.refresh();

        final C02MessageDigester bean = context.getBean(C02MessageDigester.class);
        bean.digest("Hello World");
    }
}
