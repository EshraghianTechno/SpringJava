package p02advices.p04throwsAdvice;

import org.springframework.aop.framework.ProxyFactory;

public class C03Test {
    public static void main(String... args) throws Exception {
        C01ErrorBean errorBean = new C01ErrorBean();
        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(errorBean);
        pf.addAdvice(new C02SimpleThrowsAdvice());
        C01ErrorBean proxy = (C01ErrorBean) pf.getProxy();

//        proxy.m1();
//        proxy.m2();
        try {
            proxy.m1();
        } catch (Exception ignored) {
        }
        try {
            proxy.m2();
        } catch (Exception ignored) {
        }
    }
}
