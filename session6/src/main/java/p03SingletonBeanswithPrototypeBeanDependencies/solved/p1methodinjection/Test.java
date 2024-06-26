package p03SingletonBeanswithPrototypeBeanDependencies.solved.p1methodinjection;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("file:F:\\SpringJava\\session6\\src\\main\\java\\p03SingletonBeanswithPrototypeBeanDependencies\\solved\\p1methodinjection\\config.xml");
        context.refresh();


        final SingletonScope bean = context.getBean(SingletonScope.class);
        System.out.println(bean);
        System.out.println(bean.getPrototypeBean());

        System.out.println("################");

        final SingletonScope bean2 = context.getBean(SingletonScope.class);
        System.out.println(bean2);
        System.out.println(bean2.getPrototypeBean());
    }
}
