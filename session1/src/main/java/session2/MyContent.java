package session2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Properties;

public class MyContent {
    private final String configFile = "src/main/java/session2/my-context.txt";

    public Object getBean(String id) {
        Object obj = null;
        Properties p = new Properties();
        try {
            p.load(new FileInputStream(configFile));
            Class type = Class.forName(p.getProperty(id));
            obj = type.newInstance();
            return obj;
        } catch (IOException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return obj;
    }

    public void injectIn(Object likeClientClass) {
        try {
            Class c = likeClientClass.getClass();
            for (Field field : c.getDeclaredFields()) {
                field.setAccessible(true);
                Autowired autowired = field.getAnnotation(Autowired.class);
                if (autowired != null) {
                    field.set(likeClientClass, getBean(autowired.id()));
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


    }
}
