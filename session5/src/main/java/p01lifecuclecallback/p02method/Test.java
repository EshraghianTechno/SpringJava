package p01lifecuclecallback.p02method;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("file:C:\\Users\\Admin\\IdeaProjects\\spring\\5\\session5\\session5\\src\\main\\java\\p01lifecuclecallback\\p02method\\config.xml");


        context.refresh();
        context.close();
    }
}
