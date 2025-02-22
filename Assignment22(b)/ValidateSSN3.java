import java.util.regex.*;
import java.util.Scanner;

public class ValidateSSN3 {
    public static boolean isValidSSN(String ssn) {
        return Pattern.matches("\\d{3}-\\d{2}-\\d{4}", ssn);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter SSN:");
        String ssn=sc.next();
        System.out.println(isValidSSN(ssn)?"✅ \""+ssn+"\" is valid":"❌ \""+ssn+"\" is invalid");
    }
}
