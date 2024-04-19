package p07mixconfig.p01xml;

import org.springframework.context.support.GenericXmlApplicationContext;
import p05dependon.p01xml.BeanOne;

public class Test {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("file:F:\\SpringJava\\session5\\src\\main\\java\\p07mixconfig\\p01xml\\config1.xml");
        context.refresh();


    }
}
