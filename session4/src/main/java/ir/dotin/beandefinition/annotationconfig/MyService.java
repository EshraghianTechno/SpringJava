package ir.dotin.beandefinition.annotationconfig;

public class MyService {
    private MyRepository myRepository;

    public MyRepository getMyRepository() {
        return myRepository;
    }

    public void setMyRepository(MyRepository myRepository) {
        this.myRepository = myRepository;
    }
}
