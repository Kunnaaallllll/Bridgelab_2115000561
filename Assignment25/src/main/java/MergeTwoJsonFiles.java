import org.json.JSONArray;
import java.nio.file.Files;
import java.nio.file.Paths;

class MergeTwoJsonFiles {
    public static void main(String[] args) throws Exception {
        String data1 = new String(Files.readAllBytes(Paths.get("Data.json")));
        String data2 = new String(Files.readAllBytes(Paths.get("Data1.json")));

        JSONArray jsonArray1 = new JSONArray(data1);
        JSONArray jsonArray2 = new JSONArray(data2);

        for (int i = 0; i < jsonArray2.length(); i++)
            jsonArray1.put(jsonArray2.getJSONObject(i));

        System.out.println(jsonArray1);
    }
}
