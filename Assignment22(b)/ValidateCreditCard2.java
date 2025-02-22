import java.util.*;
import java.util.regex.*;

public class ValidateCreditCard2 {
    public static boolean isValidCard(String card) {
        return card.matches("^(4\\d{15}|5\\d{15})$");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Card Number:");
        String st=sc.nextLine();
        System.out.println(isValidCard(st)?"Valid":"InValid");
    }
}
