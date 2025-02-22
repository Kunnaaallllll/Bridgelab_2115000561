import java.util.*;
import java.util.regex.*;

public class ValidateSSN2 {
    public static boolean validSSN(String ssn) {
        return ssn.matches("^\\d{3}-\\d{2}-\\d{4}$");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter SSN:");
        String st=sc.nextLine();
        System.out.println(validSSN(st)?"Valid":"InValid");
    }
}
