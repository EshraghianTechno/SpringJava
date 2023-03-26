package ir.dotin.wiring.constructor.classconfig;

public class MyService {

    private Repository repository;

    public MyService(Repository repository) {
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
