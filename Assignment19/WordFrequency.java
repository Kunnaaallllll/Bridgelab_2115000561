import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        String text="Hello world, hello Java!";
        System.out.println(countWords(text));
    }

    public static Map<String,Integer> countWords(String text) {
        Map<String,Integer> map=new HashMap<>();
        text=text.toLowerCase().replaceAll("[^a-z ]","");
        String[] words=text.split("\\s+");
        for(String word:words){
            if(map.containsKey(word)){
                map.put(word,map.get(word)+1);
            }else{
                map.put(word,1);
            }
        }
        return map;
    }
}
