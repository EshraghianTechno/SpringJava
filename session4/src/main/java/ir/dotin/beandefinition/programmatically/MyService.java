package ir.dotin.beandefinition.programmatically;

import org.springframework.stereotype.Component;

@Component(value = "myService")
public class MyService {
    private MyRepository myRepository;

    public MyService() {
        System.out.println("service is created!");
    }

    public MyService(MyRepository myRepository) {
        this.myRepository = myRepository;
        System.out.println("service is created!");
    }

    public MyRepository getMyRepository() {
        return myRepository;
    }

    public void setMyRepository(MyRepository myRepository) {
        this.myRepository = myRepository;
    }
}
