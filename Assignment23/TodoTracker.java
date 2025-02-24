import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Todo{
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

class Project{
    @Todo(task="Implement login",assignedTo="Alice",priority="HIGH")
    void loginFeature(){
        System.out.println("Login feature pending.");
    }

    @Todo(task="Optimize database queries",assignedTo="Bob")
    void optimizeDB(){
        System.out.println("Database optimization pending.");
    }

    @Todo(task="Add logout functionality",assignedTo="Charlie",priority="LOW")
    void logoutFeature(){
        System.out.println("Logout feature pending.");
    }
}

public class TodoTracker{
    public static void main(String[] args){
        for(Method method:Project.class.getDeclaredMethods()){
            if(method.isAnnotationPresent(Todo.class)){
                Todo todo=method.getAnnotation(Todo.class);
                System.out.println("Task: "+todo.task()+", Assigned To: "+todo.assignedTo()+", Priority: "+todo.priority());
            }
        }
    }
}
