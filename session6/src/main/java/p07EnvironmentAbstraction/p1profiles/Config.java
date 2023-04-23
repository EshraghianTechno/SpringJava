package p07EnvironmentAbstraction.p1profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

@Configuration
//@Profile("dev")
public class Config {
    @Bean
    @Profile("dev1")
    public DataSource dataSource1() {
        //return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.HSQL)
              /*  .addScript("my-schema.sql")
                .addScript("my-test-data.sql")
                .build();*/
        return null;
    }

    @Bean(destroyMethod = "")
    @Profile("production")
    public DataSource dataSource() throws Exception {
        Context ctx = new InitialContext();
        return (DataSource) ctx.lookup("java:comp/env/jdbc/datasource");
    }

    @Bean
    @Profile("dev")
    public BeanOne beanOne() {
        System.out.println("beanOne in config");
        return new BeanOne();
    }

    @Bean
    @Profile("production")
    public BeanTwo beanTwo() {
        System.out.println("beanTwo in config");
        return new BeanTwo();
    }
}
