import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface LogExecutionTime{}

class PerformanceTest{
    @LogExecutionTime
    void fastMethod(){
        System.out.println("Executing fast method.");
    }

    @LogExecutionTime
    void slowMethod(){
        System.out.println("Executing slow method.");
        try{Thread.sleep(500);}catch(Exception e){}
    }
}

public class ExecutionLogger{
    public static void main(String[] args) throws Exception{
        for(Method method:PerformanceTest.class.getDeclaredMethods()){
            if(method.isAnnotationPresent(LogExecutionTime.class)){
                long start=System.nanoTime();
                method.invoke(new PerformanceTest());
                long end=System.nanoTime();
                System.out.println("Method: "+method.getName()+", Execution Time: "+(end-start)/1_000_000+" ms");
            }
        }
    }
}
