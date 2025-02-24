import java.lang.reflect.*;
import java.util.*;

class ObjectMapper{
    public static <T> T toObject(Class<T> clazz,Map<String,Object> properties) throws Exception{
        T obj=clazz.getDeclaredConstructor().newInstance();
        for(Map.Entry<String,Object> entry:properties.entrySet()){
            Field field=clazz.getDeclaredField(entry.getKey());
            field.setAccessible(true);
            field.set(obj,entry.getValue());
        }
        return obj;
    }
}

class User{
    public String name;
    public int age;
}
public class CustomObjectMapper{
    public static void main(String[] args) throws Exception{
        Map<String,Object> data=new HashMap<>();
        data.put("name","Alice");
        data.put("age",25);
        
        User user=ObjectMapper.toObject(User.class,data);
        System.out.println("User Name: "+user.name);
        System.out.println("User Age: "+user.age);
    }
}
