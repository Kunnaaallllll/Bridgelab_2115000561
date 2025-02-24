import java.lang.reflect.*;

interface Greeting{
    void sayHello();
}

class GreetingImpl implements Greeting{
    public void sayHello(){
        System.out.println("Hello, World!");
    }
}
class LoggingProxy implements InvocationHandler{
    private final Object target;

    public LoggingProxy(Object target){
        this.target=target;
    }
    public Object invoke(Object proxy,Method method,Object[] args) throws Throwable{
        System.out.println("Executing: "+method.getName());
        return method.invoke(target,args);
    }
    public static <T> T createProxy(T target,Class<T> interfaceType){
        return (T)Proxy.newProxyInstance(
            interfaceType.getClassLoader(),
            new Class<?>[]{interfaceType},
            new LoggingProxy(target)
        );
    }
}
public class DynamicLoggingProxy{
    public static void main(String[] args){
        Greeting greeting=LoggingProxy.createProxy(new GreetingImpl(),Greeting.class);
        greeting.sayHello();
    }
}
