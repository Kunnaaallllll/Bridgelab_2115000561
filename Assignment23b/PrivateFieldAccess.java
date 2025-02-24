import java.lang.reflect.*;

class Person{
    private int age=25;
}

public class PrivateFieldAccess{
    public static void main(String[] args) throws Exception{
        Person p=new Person();
        Field field=Person.class.getDeclaredField("age");
        field.setAccessible(true);
        
        System.out.println("Original Age: "+field.get(p));
        field.set(p,30);
        System.out.println("Modified Age: "+field.get(p));
    }
}
