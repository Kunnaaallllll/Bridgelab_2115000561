import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@interface MaxLength{
    int value();
}
class User{
    @MaxLength(10)
    String username;

    User(String username) throws IllegalAccessException{
        this.username=username;
        validate();
    }

    void validate() throws IllegalAccessException{
        Field[] fields=this.getClass().getDeclaredFields();
        for(Field field:fields){
            if(field.isAnnotationPresent(MaxLength.class)){
                field.setAccessible(true);
                MaxLength annotation=field.getAnnotation(MaxLength.class);
                if(((String)field.get(this)).length()>annotation.value()){
                    throw new IllegalArgumentException("Max length exceeded!");
                }
            }
        }
    }
}
public class FieldValidation{
    public static void main(String[] args) throws IllegalAccessException{
        new User("ShortName");
        new User("ThisIsTooLong");
    }
}
