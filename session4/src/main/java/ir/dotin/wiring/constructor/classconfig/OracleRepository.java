package ir.dotin.wiring.constructor.classconfig;

import org.springframework.stereotype.Component;

@Component("oracle")
public class OracleRepository implements Repository {
    public OracleRepository() {
        System.out.println("Oracle repository is created!");
    }

    @Override
    public void create() {
        System.out.println("Oracle");
    }
}
