package p04InnerBeans;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("file:C:\\Users\\titan\\IdeaProjects\\spring\\5\\session4\\session4\\src\\main\\java\\p03idref\\config.xml");
        context.refresh();

        final BeanOne one = context.getBean("one", BeanOne.class);
        //  System.out.println(one.getName());
    }
}
