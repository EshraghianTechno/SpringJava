package ir.dotin.wiring.constructor.xmlbased;

public class MyService {

    private Repository repository;
    private String name;

    public MyService(Repository repository, String name) {
        this.repository = repository;
        this.name = name;
    }

    public Repository getRepository() {
        return repository;
    }

    public String getName() {
        return name;
    }

    public void setRepository(Repository repository) {
        this.repository = repository;
    }
}
