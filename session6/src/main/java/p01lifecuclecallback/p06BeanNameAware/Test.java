package p01lifecuclecallback.p06BeanNameAware;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
    public static void main(String[] args) {


        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("file:F:\\SpringJava\\session6\\src\\main\\java\\p01lifecuclecallback\\p06BeanNameAware\\config.xml");
        context.refresh();


        Player bean = context.getBean(Player.class);
        bean.play();


    }
}
