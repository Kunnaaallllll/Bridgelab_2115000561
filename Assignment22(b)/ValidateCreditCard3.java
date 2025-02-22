import java.util.*;
import java.util.regex.*;

public class ValidateCreditCard3 {
    public static boolean validCard(String card) {
        Matcher m=Pattern.compile("^(4\\d{15}|5\\d{15})$").matcher(card);
        return m.matches();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Card Number:");
        String st=sc.nextLine();
        System.out.println(validCard(st)?"Valid":"InValid");
    }
}
