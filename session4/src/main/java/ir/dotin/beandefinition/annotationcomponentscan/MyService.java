package ir.dotin.beandefinition.annotationcomponentscan;

import org.springframework.stereotype.Component;

@Component(value = "myService")
public class MyService {
    private MyRepository myRepository;

    public MyRepository getMyRepository() {
        return myRepository;
    }

    public void setMyRepository(MyRepository myRepository) {
        this.myRepository = myRepository;
    }
}
