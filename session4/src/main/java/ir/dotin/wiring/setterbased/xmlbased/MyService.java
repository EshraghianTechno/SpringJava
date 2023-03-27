package ir.dotin.wiring.setterbased.xmlbased;

public class MyService {

    private Repository repository;
    private String name;

    public MyService() {
    }

    public Repository getRepository() {
        return repository;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRepository(Repository repository) {
        this.repository = repository;
    }
}
