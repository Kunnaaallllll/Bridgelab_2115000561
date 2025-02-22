import java.util.*;
import java.util.regex.*;

public class ExtractLinks2 {
    public static List<String> extractLinks(String text) {
        List<String> list=new ArrayList<>();
        Matcher m=Pattern.compile("\\bhttps?://[\\w.-]+\\.[a-z]{2,}\\b").matcher(text);
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
