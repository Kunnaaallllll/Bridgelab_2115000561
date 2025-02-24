import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface ImportantMethod{
    String level() default "HIGH";
}

class MyService{
    @ImportantMethod
    void criticalTask(){
        System.out.println("Executing critical task.");
    }

    @ImportantMethod(level="MEDIUM")
    void normalTask(){
        System.out.println("Executing normal task.");
    }

    void regularTask(){
        System.out.println("Executing regular task.");
    }
}

public class AnnotationTest{
    public static void main(String[] args){
        for(Method method:MyService.class.getDeclaredMethods()){
            if(method.isAnnotationPresent(ImportantMethod.class)){
                ImportantMethod annotation=method.getAnnotation(ImportantMethod.class);
                System.out.println("Method: "+method.getName()+", Level: "+annotation.level());
            }
        }
    }
}
