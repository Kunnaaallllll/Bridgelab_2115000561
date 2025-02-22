import java.util.*;
import java.util.regex.*;

public class RepeatingWords3 {
    public static Set<String> findRepeating(String text) {
        Set<String> set=new HashSet<>();
        Matcher m=Pattern.compile("\\b(\\w+)\\b(?=.*\\b\\1\\b)").matcher(text);
        while(m.find()) set.add(m.group());
        return set;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Sentence:");
        String st=sc.nextLine();
        System.out.println(findRepeating(st));
    }
}
