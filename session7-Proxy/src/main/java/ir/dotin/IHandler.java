package ir.dotin;

import java.lang.reflect.*;

public class IHandler implements InvocationHandler {

    private Object target;

    private IHandler(Object targetRef) {
        this.target = targetRef;
    }

    public static Object createFor(Object target) {
        return java.lang.reflect.Proxy.newProxyInstance(target.getClass().getClassLoader(),
                                                        target.getClass().getInterfaces(),
                                                        new IHandler(target) );
    }

    // Called by dynamic proxy, when method is invoked
    @Override
    public Object invoke(Object dynamicProxy, Method method, Object[] args) throws Throwable {

        System.out.println( "Dynamic Proxy Class Name: " + dynamicProxy.getClass().getName() ); // com.sun.proxy.$Proxy0

        Object result;
        try {
            System.out.println("before method " + method.getName());
            long start = System.nanoTime();

            result = method.invoke(target, args); // call the Target method

            long end = System.nanoTime();
            System.out.println(String.format("%s took %d ns", method.getName(), (end - start)));

        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } catch (Exception e) {
            throw new RuntimeException("unexpected invocation exception: " + e.getMessage());
        } finally {
            System.out.println("after method " + method.getName());
        }

        return result;

    }
    
}
