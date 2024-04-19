package p01lifecuclecallback.p01interface;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("file:F:\\SpringJava\\session6\\src\\main\\java\\p01lifecuclecallback\\p01interface\\config.xml");


        context.refresh();
        System.out.println("before close context");
        context.close();
        System.out.println("after close context");

    }
}
