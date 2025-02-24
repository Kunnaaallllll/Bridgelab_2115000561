import java.lang.reflect.*;
import java.util.*;

public class ClassInfo{
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter class name: ");
        String className=sc.next();
        Class<?> cls=Class.forName(className);

        System.out.println("\nConstructors:");
        for(Constructor<?> constructor:cls.getDeclaredConstructors()){
            System.out.println(constructor);
        }
        System.out.println("\nFields:");
        for(Field field:cls.getDeclaredFields()){
            System.out.println(field);
        }
        System.out.println("\nMethods:");
        for(Method method:cls.getDeclaredMethods()){
            System.out.println(method);
        }
    }
}
