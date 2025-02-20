import java.util.*;
public class InvertMap {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",1);
        System.out.println(invertMap(map));
    }

    public static Map<Integer,List<String>> invertMap(Map<String,Integer> map) {
        Map<Integer,List<String>> inverted=new HashMap<>();
        for(Map.Entry<String,Integer> e:map.entrySet()){
            int key=e.getValue();
            String value=e.getKey();
            if(!inverted.containsKey(key)){
                inverted.put(key,new ArrayList<>());
            }
            inverted.get(key).add(value);
        }
        return inverted;
    }
}
