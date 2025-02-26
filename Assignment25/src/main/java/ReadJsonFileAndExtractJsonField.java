import org.json.JSONArray;
import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;

class ReadJsonFileAndExtractJsonField{
    public static void main(String[] args) throws Exception {
        String data = new String(Files.readAllBytes(Paths.get("Data.json")));
        JSONArray jsonArray = new JSONArray(data);
        for(int i=0; i<jsonArray.length(); i++){
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            System.out.println("Name: " + jsonObject.getString("name") + ", Email: " + jsonObject.getString("email"));
        }
    }
}
