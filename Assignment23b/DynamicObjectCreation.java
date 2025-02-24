import java.lang.reflect.*;

class Student{
    String name;
    Student(){
        this.name="Default Student";
    }
}
public class DynamicObjectCreation{
    public static void main(String[] args) throws Exception{
        Constructor<Student> constructor=Student.class.getDeclaredConstructor();
        Student student=constructor.newInstance();
        
        System.out.println("Student Name: "+student.name);
    }
}
