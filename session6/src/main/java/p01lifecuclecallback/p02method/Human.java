package p01lifecuclecallback.p02method;

public class Human {


    public Human() {
        System.out.println("human created");
    }


    public void myDestroy() throws Exception {

        System.out.println("destroy method of my bean called");
    }


    public void myInit() throws Exception {
        System.out.println("afterPropertiesSet method of my bean called");
    }
}
