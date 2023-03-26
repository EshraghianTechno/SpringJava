package ir.dotin.wiring.constructor.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private Repository repository;

    @Autowired
    public MyService(@Qualifier("sql") Repository repository) {
        this.repository = repository;
    }

    public Repository getRepository() {
        return repository;
    }


    //we can add @Autowired and @Qualifier to setter method, but we must have default constructor
    public void setRepository(Repository repository) {
        this.repository = repository;
    }
}
