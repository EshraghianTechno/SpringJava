package ir.dotin.beandefinition.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("file:F:\\SpringJava\\session4\\src\\main\\java\\ir\\dotin\\config.xml");
        context.refresh();
        BeanOne beanOne =  context.getBean(BeanOne.class);
        System.out.println(beanOne.name);
    }
}
