package p01lifecuclecallback.p02method;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        GenericXmlApplicationContext context=new GenericXmlApplicationContext();
        context.load("file:F:\\SpringJava\\session6\\src\\main\\java\\p01lifecuclecallback\\p02method\\config.xml");


        context.refresh();
        context.close();
    }
}
