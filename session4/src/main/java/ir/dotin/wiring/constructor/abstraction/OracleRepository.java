package ir.dotin.wiring.constructor.abstraction;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "oracle")
@Primary
public class OracleRepository implements Repository {
    public OracleRepository() {
        System.out.println("Oracle repository is created!");
    }

    @Override
    public void create() {
        System.out.println("Oracle");
    }
}
