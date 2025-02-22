import java.util.*;
import java.util.regex.*;

public class ExtractDates2 {
    public static List<String> extractDates(String text) {
        List<String> list=new ArrayList<>();
        Matcher m=Pattern.compile("\\b\\d{2}/\\d{2}/\\d{4}\\b").matcher(text);
        while(m.find())list.add(m.group());
        return list;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Text:");
        String st=sc.nextLine();
        System.out.println(extractDates(st));
    }
}
