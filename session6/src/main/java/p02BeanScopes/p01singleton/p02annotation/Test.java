package p02BeanScopes.p01singleton.p02annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        ProductService1 service1 = context.getBean(ProductService1.class);
        ProductService2 service2 = context.getBean(ProductService2.class);

        System.out.println(service1.getProductDao());
        System.out.println(service2.getProductDao());
    }
}
