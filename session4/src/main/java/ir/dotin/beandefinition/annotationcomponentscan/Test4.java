package ir.dotin.beandefinition.annotationcomponentscan;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("file:F:\\SpringJava\\session4\\src\\main\\java\\ir\\dotin\\beandefinition\\annotationcomponentscan\\config.xml");
        context.refresh();
        MyService myService = context.getBean(MyService.class);
        System.out.println(myService.getMyRepository());
    }
}
