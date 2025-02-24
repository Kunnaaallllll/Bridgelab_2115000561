import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface TaskInfo{
    String priority();
    String assignedTo();
}
class TaskManager{
    @TaskInfo(priority="High",assignedTo="John")
    void completeTask(){
        System.out.println("Task completed.");
    }
}
public class TaskProcessor{
    public static void main(String[] args) throws Exception{
        Method method=TaskManager.class.getDeclaredMethod("completeTask");
        if(method.isAnnotationPresent(TaskInfo.class)){
            TaskInfo task=method.getAnnotation(TaskInfo.class);
            System.out.println("Priority: "+task.priority());
            System.out.println("Assigned To: "+task.assignedTo());
        }
        new TaskManager().completeTask();
    }
}
