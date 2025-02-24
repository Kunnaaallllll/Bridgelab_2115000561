import java.lang.reflect.*;

class MethodTimer{
    public static void measureTime(Object obj,String methodName,Object... args) throws Exception{
        Method method=null;
        for(Method m:obj.getClass().getDeclaredMethods()){
            if(m.getName().equals(methodName)){
                method=m;
                break;
            }
        }
        if(method==null) return;
        method.setAccessible(true);
        long start=System.nanoTime();
        method.invoke(obj,args);
        long end=System.nanoTime();
        System.out.println("Execution Time: "+(end-start)+" ns");
    }
}
class Task{
    public void run(){
        for(int i=0;i<1000000;i++);
    }
}
public class ExecutionTimer{
    public static void main(String[] args) throws Exception{
        Task task=new Task();
        MethodTimer.measureTime(task,"run");
    }
}
