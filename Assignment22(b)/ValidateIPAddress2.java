import java.util.*;
import java.util.regex.*;

public class ValidateIPAddress2 {
    public static boolean isValidIP(String ip) {
        return ip.matches("^(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)){3}$");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter IP Address:");
        String st=sc.nextLine();
        System.out.println(isValidIP(st)?"Valid":"InValid");
    }
}
