import java.util.*;
import java.util.regex.*;

public class ExtractLinks {
    public static List<String> extractLinks(String text) {
        List<String> list=new ArrayList<>();
        Matcher m=Pattern.compile("https?://[\\w.-]+(?:\\.[a-zA-Z]{2,})+\\S*").matcher(text);
        while(m.find())list.add(m.group());
        return list;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Text:");
        String st=sc.nextLine();
        System.out.println(extractLinks(st));
    }
}
