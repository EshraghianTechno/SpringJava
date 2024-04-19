package p01lifecuclecallback.p05applicationContextAware;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component
public class Human2 {

    @PostConstruct
    public void postTest(){
        System.out.println("postTest");
    }

    @PreDestroy
    public void preTest(){
        System.out.println("preDestroy");
    }
}
