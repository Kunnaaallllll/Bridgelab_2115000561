import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Inject{}

class Service{
    public void serve(){System.out.println("Service is running!");}
}
class Client{
    @Inject
    private Service service;

    public void execute(){service.serve();}
}
class DIContainer{
    private static Map<Class<?>,Object> instances=new HashMap<>();

    public static <T> T getInstance(Class<T> clazz) throws Exception{
        if(instances.containsKey(clazz)) return clazz.cast(instances.get(clazz));

        T obj=clazz.getDeclaredConstructor().newInstance();
        for(Field field:clazz.getDeclaredFields()){
            if(field.isAnnotationPresent(Inject.class)){
                field.setAccessible(true);
                Object dependency=getInstance(field.getType());
                field.set(obj,dependency);
            }
        }
        instances.put(clazz,obj);
        return obj;
    }
}
public class SimpleDI{
    public static void main(String[] args) throws Exception{
        Client client=DIContainer.getInstance(Client.class);
        client.execute();
    }
}
