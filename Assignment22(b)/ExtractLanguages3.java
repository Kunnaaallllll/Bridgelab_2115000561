import java.util.*;
import java.util.regex.*;

public class ExtractLanguages3 {
    public static List<String> extractLang(String text) {
        List<String> list=new ArrayList<>();
        Matcher m=Pattern.compile("\\b(JavaScript|Java|Python|Go|C\\+\\+|C#|Ruby|Swift|Kotlin|PHP|Perl|R)\\b").matcher(text);
        while(m.find()) list.add(m.group());
        return list;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Text:");
        String st=sc.nextLine();
        System.out.println(extractLang(st));
    }
}
