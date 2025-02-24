import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface RoleAllowed{
    String value();
}

class User{
    String role;
    User(String role){
        this.role=role;
    }
}
class SecureService{
    @RoleAllowed("ADMIN")
    void adminMethod(){
        System.out.println("Admin method executed.");
    }
}
class AccessControl{
    static void invokeIfAllowed(User user,Object obj,String methodName) throws Exception{
        Method method=obj.getClass().getDeclaredMethod(methodName);
        if(method.isAnnotationPresent(RoleAllowed.class)){
            RoleAllowed roleAllowed=method.getAnnotation(RoleAllowed.class);
            if(roleAllowed.value().equals(user.role)){
                method.invoke(obj);
                return;
            }
        }
        System.out.println("Access Denied!");
    }
}
public class RoleBasedAccess{
    public static void main(String[] args) throws Exception{
        User admin=new User("ADMIN");
        User guest=new User("GUEST");
        SecureService service=new SecureService();

        AccessControl.invokeIfAllowed(admin,service,"adminMethod");
        AccessControl.invokeIfAllowed(guest,service,"adminMethod");
    }
}
