package p02autowiring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("file:F:\\SpringJava\\session5\\src\\main\\java\\p02autowiring\\config.xml");
        context.refresh();

        final Target targetByName = context.getBean("targetByName", Target.class);
        System.out.println(targetByName.getBeanThree());
    }
}
