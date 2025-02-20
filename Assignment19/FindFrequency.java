import java.util.*;

public class FindFrequency {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange"));
        System.out.println(frequency(list));
    }
    public static Map<String,Integer> frequency(List<String>list){
        HashMap<String ,Integer> map=new HashMap<>();
        for(String s:list){
            if(!map.containsKey(s)){
                map.put(s,1);
            }else{
                map.put(s,map.get(s)+1);
            }
        }
        return map;
    }
}