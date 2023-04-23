package ir.dotin.wiring.setterbased.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private Repository repository;

    public MyService() {
    }

    public Repository getRepository() {
        return repository;
    }


    //we can add @Autowired and @Qualifier to setter method, but we must have default constructor
    @Autowired
    @Qualifier("oracle")
    public void setRepository(Repository repository) {
        this.repository = repository;
    }
}
