package p01EnvironmentAbstraction.p1profiles.p2annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

@Configuration
@Profile("dev")
public class Config {
//    @Bean
//    @Profile("dev")
//    public DataSource dataSource1() {
//        //return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.HSQL)
//              /*  .addScript("my-schema.sql")
//                .addScript("my-test-data.sql")
//                .build();*/
//        return  null;
//    }

//    @Bean(destroyMethod="")
//    @Profile("production")
//    public DataSource dataSource() throws Exception {
//        Context ctx = new InitialContext();
//        return (DataSource) ctx.lookup("java:comp/env/jdbc/datasource");
//    }

    @Bean
//    @Profile("dev")
    public BeanOne beanOne() {
        System.out.println("BeanOne In config 1");
        return new BeanOne();
    }

    @Bean
//    @Profile("production")
    public BeanTwo beanTwo() {
        System.out.println("BeanTwo In config 1");
        return new BeanTwo();
    }

    @Bean
//    @Profile("production")
    public BeanThree beanThree() {
        System.out.println("BeanThree In config 1");
        return new BeanThree();
    }
}
