import java.util.*;
import java.util.regex.*;

public class ExtractCapitalizedWords2 {
    public static List<String> extractWords(String text) {
        List<String> list=new ArrayList<>();
        Matcher m=Pattern.compile("\\b[A-Z][a-z]*\\b").matcher(text);
        while(m.find())list.add(m.group());
        return list;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Text:");
        String st=sc.nextLine();
        System.out.println(extractWords(st));
    }
}
