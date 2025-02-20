import java.util.*;

public class MaxValueKey {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("A",10);
        map.put("B",20);
        map.put("C",15);
        System.out.println(findMaxKey(map));
    }

    public static String findMaxKey(Map<String,Integer> map) {
        String maxKey="";
        int maxValue=Integer.MIN_VALUE;
        for(Map.Entry<String,Integer> e:map.entrySet()){
            if(e.getValue()>maxValue){
                maxValue=e.getValue();
                maxKey=e.getKey();
            }
        }
        return maxKey;
    }
}
