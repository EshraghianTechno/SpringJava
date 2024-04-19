package p04FactoryBean.p01xml;

import org.springframework.beans.factory.FactoryBean;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class C01MessageDigestFactoryBean implements FactoryBean<MessageDigest> {

    private String algorithmName = "MD5";
    private MessageDigest messageDigest;

    {
        try {
            messageDigest = MessageDigest.getInstance(algorithmName);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    public void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
    }

    public C01MessageDigestFactoryBean() {
    }

    @Override
    public MessageDigest getObject() throws Exception {
        return messageDigest;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }

    @Override
    public Class<MessageDigest> getObjectType() {
        return MessageDigest.class;
    }

//    @Override
//    public void afterPropertiesSet() throws Exception {
//        messageDigest = MessageDigest.getInstance(algorithmName);
//    }
}
