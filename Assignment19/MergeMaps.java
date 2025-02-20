import java.util.*;
public class MergeMaps {
    public static void main(String[] args) {
        Map<String,Integer> map1=new HashMap<>();
        map1.put("A",1);
        map1.put("B",2);
        Map<String,Integer> map2=new HashMap<>();
        map2.put("B",3);
        map2.put("C",4);
        System.out.println(mergeMaps(map1,map2));
    }
    public static Map<String,Integer> mergeMaps(Map<String,Integer> map1,Map<String,Integer> map2) {
        Map<String,Integer> merged=new HashMap<>(map1);
        for(Map.Entry<String,Integer> e:map2.entrySet()){
            String key=e.getKey();
            int value=e.getValue();
            if(merged.containsKey(key)){
                merged.put(key,merged.get(key)+value);
            }else{
                merged.put(key,value);
            }
        }
        return merged;
    }
}
