import java.util.*;
import java.util.regex.*;

public class ValidateIPAddress3 {
    public static boolean validIP(String ip) {
        Matcher m=Pattern.compile("^(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)){3}$").matcher(ip);
        return m.matches();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter IP Address:");
        String st=sc.nextLine();
        System.out.println(validIP(st)?"Valid":"InValid");
    }
}
