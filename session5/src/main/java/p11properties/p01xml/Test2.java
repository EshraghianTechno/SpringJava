package p11properties.p01xml;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.sql.SQLException;

public class Test2 {
    public static void main(String[] args) throws SQLException {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("file:F:\\SpringJava\\session5\\src\\main\\java\\p11properties\\p01xml\\datasource\\datasource.properties");
        context.refresh();


        final InjectProperty injectProperty = context.getBean(InjectProperty.class);
        final String property = injectProperty.getProperties().getProperty("jdbc.url");
        System.out.println(property);


    }
}
