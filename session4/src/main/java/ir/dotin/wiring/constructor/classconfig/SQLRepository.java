package ir.dotin.wiring.constructor.classconfig;

import org.springframework.stereotype.Component;

@Component("sql")
public class SQLRepository implements Repository {
    public SQLRepository() {
        System.out.println("sql repository is created!");
    }

    @Override
    public void create() {
        System.out.println("SQL");
    }
}
