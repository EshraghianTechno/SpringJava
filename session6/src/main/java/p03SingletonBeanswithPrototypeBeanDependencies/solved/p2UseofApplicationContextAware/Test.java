package p03SingletonBeanswithPrototypeBeanDependencies.solved.p2UseofApplicationContextAware;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("file:F:\\SpringJava\\session6\\src\\main\\java\\p03SingletonBeanswithPrototypeBeanDependencies\\solved\\p2UseofApplicationContextAware\\config.xml");
        context.refresh();
        SingletonBean singleton1 = context.getBean(SingletonBean.class, "singletonBean");
        System.out.println(singleton1);
        System.out.println(singleton1.getPrototypeBean());
        //2
        SingletonBean singleton2 = context.getBean(SingletonBean.class, "singletonBean");
        System.out.println(singleton2);
        System.out.println(singleton2.getPrototypeBean());

    }
}
