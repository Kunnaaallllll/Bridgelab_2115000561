import java.util.*;
import java.util.regex.*;

public class FindRepeatingWords {
    public static Set<String> findRepeats(String text) {
        Set<String> set=new HashSet<>();
        Matcher m=Pattern.compile("\\b(\\w+)\\b(?:\\s+\\1\\b)").matcher(text);
        while(m.find()) set.add(m.group(1));
        return set;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Text:");
        String st=sc.nextLine();
        System.out.println(findRepeats(st));
    }
}
