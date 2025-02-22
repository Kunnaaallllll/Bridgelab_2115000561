import java.util.*;
import java.util.regex.*;

public class ExtractCurrencyValues {
    public static List<String> extractCurrency(String text) {
        List<String> list=new ArrayList<>();
        Matcher m=Pattern.compile("\\$?\\d+\\.\\d{2}").matcher(text);
        while(m.find()) list.add(m.group());
        return list;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Text:");
        String st=sc.nextLine();
        System.out.println(extractCurrency(st));
    }
}
