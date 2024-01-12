import com.ibm.msg.client.jms.JmsConnectionFactory;
import com.ibm.msg.client.jms.JmsFactoryFactory;
import com.ibm.msg.client.wmq.WMQConstants;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args ){
        System.out.println("test-----------");
        try {
            JmsFactoryFactory jmsFactory = JmsFactoryFactory.getInstance(WMQConstants.WMQ_PROVIDER);
            JmsConnectionFactory connectionFactory = jmsFactory.createConnectionFactory();
        }catch (Exception e){
            System.out.println("111");
        }
        List list = new ArrayList();
    }
}
