package ir.dotin.wiring.constructor.abstraction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "myService")
public class MyService {

    private Repository repository;

    public MyService() {
        System.out.println("service is created!");
    }

    public Repository getRepository() {
        return repository;
    }

    @Autowired
    public void setRepository(Repository repository) {
        this.repository = repository;
    }
}
