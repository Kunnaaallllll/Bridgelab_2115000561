import java.lang.reflect.*;
import java.util.*;

class JsonConverter{
    public static String toJson(Object obj) throws Exception{
        Class<?> clazz=obj.getClass();
        StringBuilder json=new StringBuilder("{");

        Field[] fields=clazz.getDeclaredFields();
        for(int i=0;i<fields.length;i++){
            fields[i].setAccessible(true);
            json.append("\"").append(fields[i].getName()).append("\":");
            json.append("\"").append(fields[i].get(obj)).append("\"");
            if(i<fields.length-1) json.append(",");
        }

        json.append("}");
        return json.toString();
    }
}
class Person{
    public String name="John";
    private int age=30;
}
public class ObjectToJson{
    public static void main(String[] args) throws Exception{
        Person person=new Person();
        System.out.println(JsonConverter.toJson(person));
    }
}
