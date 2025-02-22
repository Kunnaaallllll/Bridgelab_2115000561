import java.util.*;
import java.util.regex.*;

public class ValidateIPAddress {
    public static boolean validIP(String ip) {
        return ip.matches("^(25[0-5]|2[0-4][0-9]|1?[0-9]?[0-9])\\.(25[0-5]|2[0-4][0-9]|1?[0-9]?[0-9])\\.(25[0-5]|2[0-4][0-9]|1?[0-9]?[0-9])\\.(25[0-5]|2[0-4][0-9]|1?[0-9]?[0-9])$");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter IP Address:");
        String st=sc.nextLine();
        System.out.println(validIP(st)?"Valid":"InValid");
    }
}
