import java.lang.reflect.*;
import java.util.Scanner;

class MathOperations{
    public int add(int a,int b){return a+b;}
    public int subtract(int a,int b){return a-b;}
    public int multiply(int a,int b){return a*b;}
}

public class DynamicMethodInvoke{
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        MathOperations obj=new MathOperations();
        System.out.print("Enter method name (add/subtract/multiply): ");
        String methodName=sc.next();
        Method method=MathOperations.class.getMethod(methodName,int.class,int.class);
        System.out.print("Enter two numbers: ");
        int x=sc.nextInt(),y=sc.nextInt();
        
        int result=(int)method.invoke(obj,x,y);
        System.out.println("Result: "+result);
    }
}
