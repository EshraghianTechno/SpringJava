package p03SingletonBeanswithPrototypeBeanDependencies.problem;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        // var context=new ClassPathXmlApplicationContext("kinder-school-config.xml");
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("file:F:\\SpringJava\\session6\\src\\main\\java\\p03SingletonBeanswithPrototypeBeanDependencies\\problem\\config.xml");
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
