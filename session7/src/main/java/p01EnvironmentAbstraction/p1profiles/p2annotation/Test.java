package p01EnvironmentAbstraction.p1profiles.p2annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        //var context=new AnnotationConfigApplicationContext(Config.class);
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("test");
        context.register(Config.class,Config2.class);
        context.refresh();
        context.getBean(BeanThree.class);



//        final BeanThree bean = context.getBean(BeanThree.class);
//        System.out.println(bean);

    }
}
