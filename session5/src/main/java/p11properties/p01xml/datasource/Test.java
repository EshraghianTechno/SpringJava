package p11properties.p01xml.datasource;

import org.springframework.context.support.GenericXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("file:F:\\SpringJava\\session5\\src\\main\\java\\p11properties\\p01xml\\datasource\\config.xml");
        context.refresh();
        Object datasource = context.getBean("datasource");
        System.out.println(datasource);
//        final Connection connection = datasource.getConnection();
//        final PreparedStatement preparedStatement = connection.prepareStatement("select * from product");
//        final ResultSet resultSet = preparedStatement.executeQuery();
//        while (resultSet.next())
//            System.out.println(resultSet.getString("name"));


    }
}
