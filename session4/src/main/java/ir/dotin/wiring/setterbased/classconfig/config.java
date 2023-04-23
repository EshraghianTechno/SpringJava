package ir.dotin.wiring.setterbased.classconfig;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {

    @Bean()
    public MyService myService(@Qualifier("sql") Repository repository) {
        return new MyService(repository);
    }

    @Bean("sql")
    public Repository sql() {
        return new SQLRepository();
    }

    @Bean("oracle")
    public Repository oracle() {
        return new OracleRepository();
    }
}
