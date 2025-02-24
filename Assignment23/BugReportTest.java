import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(BugReports.class)
@interface BugReport{
    String description();
}

@Retention(RetentionPolicy.RUNTIME)
@interface BugReports{
    BugReport[] value();
}

class BugTracker{
    @BugReport(description="Null pointer issue")
    @BugReport(description="Index out of bounds")
    void buggyMethod(){
        System.out.println("Executing buggy method.");
    }
}

public class BugReportTest{
    public static void main(String[] args) throws Exception{
        Method method=BugTracker.class.getDeclaredMethod("buggyMethod");
        if(method.isAnnotationPresent(BugReports.class)){
            for(BugReport report:method.getAnnotation(BugReports.class).value()){
                System.out.println("Bug: "+report.description());
            }
        }
        new BugTracker().buggyMethod();
    }
}
