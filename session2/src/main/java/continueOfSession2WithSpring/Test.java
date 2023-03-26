package continueOfSession2WithSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        Client client = (Client) applicationContext.getBean("client");
        client.callTransfer(124,875);

    }
}
