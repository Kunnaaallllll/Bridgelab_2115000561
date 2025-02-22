import java.util.*;

public class CensorBadWords {
    public static String censorWords(String text, List<String> badWords) {
        for(String word: badWords) text=text.replaceAll("(?i)\\b"+word+"\\b", "****");
        return text;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String> badWords=Arrays.asList("damn", "stupid");
        System.out.println("Enter Text:");
        String st=sc.nextLine();
        System.out.println(censorWords(st, badWords));
    }
}
