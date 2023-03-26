package ir.dotin.wiring.constructor.annotation;


import org.springframework.context.support.GenericXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("file:F:\\SpringJava\\session4\\src\\main\\java\\ir\\dotin\\wiring\\constructor\\annotation\\config.xml");
        context.refresh();
        MyService myService =  context.getBean(MyService.class);
        myService.getRepository().create();

    }
}
