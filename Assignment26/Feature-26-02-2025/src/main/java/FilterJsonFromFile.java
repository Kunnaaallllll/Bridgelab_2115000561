import org.json.*;
import java.nio.file.*;

public class FilterJsonFromFile {
    public static void main(String[] args) throws Exception {
        String data = new String(Files.readAllBytes(Paths.get("Data.json")));
        JSONArray jsonArray = new JSONArray(data);

        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            if (jsonObject.getInt("age") > 25)
                System.out.println(jsonObject);
        }
    }
}
