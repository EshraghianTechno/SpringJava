package p07EnvironmentAbstraction.p1profiles;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        //var context=new AnnotationConfigApplicationContext(Config.class);
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("dev");
        context.register(Config3.class);
        context.refresh();


        //
//        final BeanThree bean = context.getBean(BeanThree.class);
//        System.out.println(bean);

    }
}
