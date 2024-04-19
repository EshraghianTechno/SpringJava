package ir.dotin.beandefinition.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("file:F:\\SpringJava\\session4\\src\\main\\java\\ir\\dotin\\beandefinition\\xml\\config.xml");
        context.refresh();
        BeanOne beanOne = context.getBean(BeanOne.class);
        BeanOne beanOne1 = (BeanOne) context.getBean("beanOne");
        System.out.println(beanOne.getName());
        System.out.println(beanOne.getAge());
        System.out.println(beanOne1.getName());
    }
}
