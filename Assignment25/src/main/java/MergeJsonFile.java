import org.json.JSONObject;
import java.util.*;

class MergeJsonObject {
    public static void main(String[] args) {
        JSONObject obj1 = new JSONObject().put("name", "kunal").put("age", "21");
        JSONObject obj2 = new JSONObject().put("id", "2115");

        Map<String, Object> map1 = obj1.toMap();
        Map<String, Object> map2 = obj2.toMap();

        map1.putAll(map2);
        JSONObject mergedJson = new JSONObject(map1);

        System.out.println(mergedJson);
    }
}
