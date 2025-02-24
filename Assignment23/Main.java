import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@interface JsonField{
    String name();
}

class User{
    @JsonField(name="user_name")
    String name;
    @JsonField(name="user_age")
    int age;

    User(String name,int age){
        this.name=name;
        this.age=age;
    }
}

class JsonSerializer{
    static String toJson(Object obj) throws IllegalAccessException{
        String json="{";
        Field[] fields=obj.getClass().getDeclaredFields();
        for(Field field:fields){
            if(field.isAnnotationPresent(JsonField.class)){
                field.setAccessible(true);
                JsonField annotation=field.getAnnotation(JsonField.class);
                json+="\""+annotation.name()+"\":\""+field.get(obj)+"\",";
            }
        }
        if(json.length()>1)json=json.substring(0,json.length()-1);
        json+="}";
        return json;
    }
}

public class Main{
    public static void main(String[] args) throws IllegalAccessException{
        User user=new User("Kunal",25);
        System.out.println(JsonSerializer.toJson(user));
    }
}
