package ir.dotin.beandefinition.annotationclassconfig;

import org.springframework.stereotype.Component;

@Component(value = "myRepo")
public class MyRepository {
    public MyRepository() {
        System.out.println("repository is created!");
    }
}
